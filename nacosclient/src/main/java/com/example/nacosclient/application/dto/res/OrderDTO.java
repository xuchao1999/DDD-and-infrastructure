package com.example.nacosclient.application.dto.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * The type Order dto.
 *
 * @author xuchao
 * @date 2022 -07-21 14:23:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    /**
     * 订单id.
     */
    private String orderId;
    /**
     * 商品详情.
     */
    private List<OrderItemDTO> orderItemDTOList;
    /**
     * 总价.
     */
    private BigDecimal totalPrices;
}
