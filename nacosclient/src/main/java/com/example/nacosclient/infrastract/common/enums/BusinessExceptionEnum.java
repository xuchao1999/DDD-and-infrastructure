package com.example.nacosclient.infrastract.common.enums;

import com.example.nacosclient.infrastract.exception.BusinessExceptionAssert;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 业务异常枚举
 *
 * @author xc
 */
@Getter
@AllArgsConstructor
public enum BusinessExceptionEnum implements BusinessExceptionAssert {

    /**
     * Total price not right business exception enum.
     */
    TOTAL_PRICE_NOT_RIGHT(2000, "订单总价不正确"),

    PRODUCT_NOT_EXIST(2001, "商品不存在"),
    INVENTORY_DONT_ENOUGH(2002, "库存不足")
    ;
    /**
     * 返回码
     */
    private int code;
    /**
     * 返回消息
     */
    private String message;
}
