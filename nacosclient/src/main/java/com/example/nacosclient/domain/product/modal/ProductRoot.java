package com.example.nacosclient.domain.product.modal;

import com.example.nacosclient.application.dto.res.AddrDTO;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品聚合根.
 *
 * @author xuchao
 * @date 2022 -07-21 15:10:31
 */
@Data
public class ProductRoot {
    /**
     * 商品id
     */
    private String productId;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 价格.
     */
    private BigDecimal price;
}
