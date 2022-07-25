package com.example.nacosclient.application.dto.req.command;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

/**
 * 下单command.
 *
 * @author xuchao
 * @date 2022 -07-21 14:07:19
 */
@Data
public class CheckoutCommond {
    /**
     * 订单项详情.
     */
    @NotNull(message = "订单项不能为空")
    @Valid
    private List<OrderItemInfo> orderItemInfoList;
    /**
     * 订单总价.
     */
    @NotNull(message = "订单总价不能为空")
    private BigDecimal totalPrice;

}
