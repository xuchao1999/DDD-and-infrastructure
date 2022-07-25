package com.example.nacosclient.application.assembler;

import com.example.nacosclient.application.dto.res.AddrDTO;
import com.example.nacosclient.application.dto.res.OrderDTO;
import com.example.nacosclient.application.dto.res.OrderItemDTO;
import com.example.nacosclient.domain.order.modal.OrderRoot;
import com.example.nacosclient.domain.order.modal.entiry.OrderItemDO;
import com.example.nacosclient.domain.product.modal.ProductRoot;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Order assembler.
 *
 * @author xuchao
 * @date 2022 -07-21 16:38:15
 */
public class OrderAssembler {
    /**
     * To order dto order dto.
     *
     * @param productRootList the product root list
     * @param orderRoot       the order root
     * @return the order dto
     */
    public static OrderDTO toOrderDTO(List<ProductRoot> productRootList, OrderRoot orderRoot) {

        List<OrderItemDTO> orderItemList = new ArrayList<>();
        for (OrderItemDO orderItemDO : orderRoot.getOrderItemDOList()) {
            // 装配AddrDTO
            AddrDTO addrDTO = new AddrDTO();
            addrDTO.setAddress(orderItemDO.getAddressVObj().getAddress());
            addrDTO.setName(orderItemDO.getAddressVObj().getName());
            addrDTO.setPhone(orderItemDO.getAddressVObj().getPhone());

            OrderItemDTO orderItemDTO = new OrderItemDTO();
            // 根据商品id过滤商品信息
            ProductRoot productRoot = productRootList.stream().map(x -> {
                x.getProductId().equals(orderItemDO.getItemId());
                return x;
            }).findFirst().orElse(null);
            if(null != productRoot){
                // 商品名称
                orderItemDTO.setName(productRoot.getName());
            }

            // 装配orderItemDTO
            orderItemDTO.setPrice(orderItemDO.getPrice());
            orderItemDTO.setQuantity(orderItemDO.getQuantity());
            orderItemDTO.setAddrDTO(addrDTO);

            orderItemList.add(orderItemDTO);
        }

        // 装配OrderDTO
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId(orderRoot.getOrderId());
        orderDTO.setOrderItemDTOList(orderItemList);
        orderDTO.setTotalPrices(orderRoot.getTotalPrice());

        return orderDTO;
    }
}
