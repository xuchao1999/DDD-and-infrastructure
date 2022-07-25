package com.example.nacosclient.application.dto.res;

import lombok.Data;

import java.math.BigDecimal;

/**
 * The type order item dto.
 *
 * @author xuchao
 * @date 2022 -07-21 14:22:06
 */
@Data
public class OrderItemDTO {
    /**
     * 订单项名称
     */
    private String name;
    /**
     * 价格.
     */
    private BigDecimal price;
    /**
     * 数量.
     */
    private Integer quantity;
    /**
     * 收货地址.
     */
    private AddrDTO addrDTO;
}
