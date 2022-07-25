package com.example.nacosclient.domain.order.modal;

import com.example.nacosclient.domain.order.modal.entiry.OrderItemDO;
import com.example.nacosclient.infrastract.common.enums.BusinessExceptionEnum;
import com.example.nacosclient.infrastract.common.enums.ParamExceptionEnum;
import lombok.Data;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.List;

/**
 * 订单聚合根
 * @author xuchao
 * @date 2022 -07-20 10:19:31
 */
@Data
public class OrderRoot {
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 订单项
     */
    private List<OrderItemDO> orderItemDOList;
    /**
     * 总价
     */
    private BigDecimal totalPrice;

    public OrderRoot(String orderId, List<OrderItemDO> orderItemDOList, BigDecimal totalPrice){
        // 判断空orderId
        ParamExceptionEnum.ORDERID_NOT_NULL.assertIsFalse(StringUtils.isNotBlank(orderId));
        // 判空订单项
        ParamExceptionEnum.ORDER_ITEM_LIST_NOT_NULL.assertIsFalse(CollectionUtils.isNotEmpty(orderItemDOList));
        // 订单项价格求和
        BigDecimal itemTotalPrice =
                orderItemDOList.stream().map(t -> t.getPrice().multiply(BigDecimal.valueOf(t.getQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        // 判断订单项价格和是否与订单总价相等
        BusinessExceptionEnum.TOTAL_PRICE_NOT_RIGHT.assertIsFalse(totalPrice.compareTo(itemTotalPrice) == 0);

        this.orderId = orderId;
        this.orderItemDOList = orderItemDOList;
        this.totalPrice = totalPrice;
    }


}
