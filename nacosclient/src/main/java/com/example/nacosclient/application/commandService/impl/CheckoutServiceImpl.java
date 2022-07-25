package com.example.nacosclient.application.commandService.impl;

import com.example.nacosclient.application.ExternalService.InventoryService;
import com.example.nacosclient.application.assembler.OrderAssembler;
import com.example.nacosclient.application.commandService.CheckoutService;
import com.example.nacosclient.application.dto.req.command.OrderItemInfo;
import com.example.nacosclient.application.dto.res.OrderDTO;
import com.example.nacosclient.application.dto.req.command.CheckoutCommond;
import com.example.nacosclient.domain.order.modal.OrderRoot;
import com.example.nacosclient.domain.order.modal.entiry.OrderItemDO;
import com.example.nacosclient.domain.order.modal.vlaueObj.AddressVObj;
import com.example.nacosclient.domain.order.repository.OrderRepository;
import com.example.nacosclient.domain.product.modal.ProductRoot;
import com.example.nacosclient.domain.product.repository.ProductRepository;
import com.example.nacosclient.infrastract.common.enums.BusinessExceptionEnum;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * The type Checkout service.
 *
 * @author xuchao
 * @date 2022 -07-21 14:29:34
 */
@Service
@Validated
public class CheckoutServiceImpl implements CheckoutService {
    @Resource
    private ProductRepository productRepository;
    @Resource
    private InventoryService inventoryService;
    @Resource
    private OrderRepository orderRepository;
    @Override
    public OrderDTO checkout(@Valid CheckoutCommond cmd) {

        List<ProductRoot> productRootList = new ArrayList<>();
        List<OrderItemDO> orderItemDOList = new ArrayList<>();
        // 生产随机的订单号
        String orderId = UUID.randomUUID().toString().replaceAll("-", "");

        for(OrderItemInfo item : cmd.getOrderItemInfoList()){
            // 调商品服务，验证商品信息
            ProductRoot productRoot = productRepository.getProductById(item.getOrderItemId());
            BusinessExceptionEnum.PRODUCT_NOT_EXIST.assertNotNull(productRoot);
            productRootList.add(productRoot);

            // 调库存服务，校验库存
            BusinessExceptionEnum.INVENTORY_DONT_ENOUGH.assertIsFalse(inventoryService.withhold(item.getOrderItemId(), item.getQuantity()));

            // 构建订单项收货地址
            AddressVObj addressVObj = new AddressVObj(item.getName(), item.getPhone(), item.getAddress());

            // 构建OrderItemDO
            OrderItemDO orderItemDO = new OrderItemDO(item.getOrderItemId(), orderId, item.getPrice(), addressVObj, item.getQuantity());

            orderItemDOList.add(orderItemDO);
        }

        // 构建聚合根
        OrderRoot orderRoot = new OrderRoot(orderId, orderItemDOList, cmd.getTotalPrice());
        // 持久化订单
        boolean save = orderRepository.save(orderRoot);

        return OrderAssembler.toOrderDTO(productRootList, orderRoot);
    }
}
