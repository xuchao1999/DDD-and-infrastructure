package com.example.nacoscomsumer.domain.order.modal.entiry;


import com.example.nacoscomsumer.domain.order.modal.vlaueObj.AddressVObj;
import com.example.nacoscomsumer.infrastract.common.enums.ExceptionEnum;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;


import java.math.BigDecimal;

/**
 * 订单项实体
 *
 * @author xuchao
 * @date 2022 -07-20 09:41:46
 */
@Data
public class OrderItemDO {
    /**
     * 订单项id
     */
    private String itemId;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 地址
     */
    private AddressVObj addressVObj;
    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 创建订单项，及校验
     *
     * @param itemId      订单项id
     * @param orderId     订单id
     * @param price       订单项价格
     * @param addressVObj 地址
     * @param quantity    订单项数量
     */
    public OrderItemDO(String itemId, String orderId, BigDecimal price, AddressVObj addressVObj, Integer quantity) {
        // 订单项不能为空
        ExceptionEnum.ITEMID_NOT_NULL.assertIsFalse(StringUtils.isNotBlank(itemId));
        // 订单id不能为空
        ExceptionEnum.ORDERID_NOT_NULL.assertIsFalse(StringUtils.isNotBlank(orderId));
        // 订单项价格不能小于0
        ExceptionEnum.PRICE_NOT_LESS_THEN_ZERO.assertIsFalse(price.compareTo(BigDecimal.ZERO) >= 0);
        // 地址不能为空
        ExceptionEnum.ADDRESSVOBJ_NOT_NULL.assertNotNull(addressVObj);
        // 订单项数量要大于0
        ExceptionEnum.QUANTITY_NOT_LESS_THEN_ZERO.assertIsFalse(quantity > 0);

        this.itemId = itemId;
        this.orderId = orderId;
        this.price = price;
        this.addressVObj = addressVObj;
        this.quantity = quantity;
    }
}
