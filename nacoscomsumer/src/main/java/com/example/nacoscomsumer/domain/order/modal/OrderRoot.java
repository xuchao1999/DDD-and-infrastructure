package com.example.nacoscomsumer.domain.order.modal;

import com.example.claim.domain.order.modal.entiry.OrderItemDO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName: OrderRoot
 * @description: 订单聚合根
 * @Author: Chao Xu
 * @Date: 2022/7/12 15:57
 **/
@Data
public class OrderRoot {
    // 订单id
    private String orderId;
    // 订单项
    private List<OrderItemDO> orderItemDOList;
    // 总价
    private BigDecimal totalPrice;
}
