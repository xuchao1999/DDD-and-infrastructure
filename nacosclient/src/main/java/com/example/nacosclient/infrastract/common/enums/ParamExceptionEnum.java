package com.example.nacosclient.infrastract.common.enums;

import com.example.nacosclient.domain.order.modal.entiry.OrderItemDO;
import com.example.nacosclient.infrastract.exception.BusinessExceptionAssert;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;

/**
 * 参数异常枚举.
 * @author xc
 */
@Getter
@AllArgsConstructor
public enum ParamExceptionEnum implements BusinessExceptionAssert {
    /**
     * param dont null exception enum.
     */
    param_dont_null(00000, "{0}不能为空"),
    /**
     * goods no is null exception enum.
     */
    goods_no_is_null(1000, "商品号为空"),

    /**
     * stock not enough exception enum.
     */
    stock_not_enough(1001, "库存不足"),
    /**
     * goods not exit exception enum.
     */
    goods_not_exit(1002, "商品不存在"),

    /**
     * Itemid not null exception enum.
     */
    ITEMID_NOT_NULL(1003, "订单项id不能为空"),

    /**
     * Orderid not null exception enum.
     */
    ORDERID_NOT_NULL(1003, "订单id不能为空"),

    /**
     * Price not less then zero exception enum.
     */
    PRICE_NOT_LESS_THEN_ZERO(1003, "价格不能小于0不能为空"),
    /**
     * Addressvobj not null exception enum.
     */
    ADDRESSVOBJ_NOT_NULL(1003, "地址不能为空"),
    /**
     * Quantity not less then zero exception enum.
     */
    QUANTITY_NOT_LESS_THEN_ZERO(1003, "数量不能小于0"),

    /**
     * Name not null param exception enum.
     */
    NAME_NOT_NULL(1004, "姓名不能为空"),

    /**
     * Phone not null param exception enum.
     */
    PHONE_NOT_NULL(1005, "电话不能为空"),

    /**
     * Address not null param exception enum.
     */
    ADDRESS_NOT_NULL(1006, "地址详情不能为空"),

    /**
     * Order id not null param exception enum.
     */
    ORDER_ID_NOT_NULL(1007, "订单号不能为空"),
    /**
     * Order item list not null param exception enum.
     */
    ORDER_ITEM_LIST_NOT_NULL(1008, "订单项不能为空"),

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
