package com.example.nacosclient.application.dto.req.command;

import lombok.Data;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * 订单项详情
 *
 * @author xuchao
 * @date 2022 -07-21 15:54:34
 */
@Data
public class OrderItemInfo {
    /**
     * 订单项id
     */
    @NotBlank(message = "订单项id不能为空")
    private String orderItemId;
    /**
     * 价格
     */
    @NotNull(message = "价格不能为空")
    @Min(value = 0, message = "价格必须大于0")
    private BigDecimal price;
    /**
     * 数量
     */
    @NotNull(message = "数据不能为空")
    @Min(value = 0, message = "数据不能小于0")
    private Integer quantity;


    /**
     * 姓名
     */
    @NotBlank(message = "姓名不能为空")
    private String name;
    /**
     * 电话
     */
    @NotBlank(message = "电话不能为空")
    private String phone;
    /**
     * 地址详情
     */
    @NotBlank(message = "地址详情不能为空")
    private String address;
}
