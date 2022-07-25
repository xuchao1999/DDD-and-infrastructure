package com.example.nacosclient.domain.product.repository;

import com.example.nacosclient.domain.product.modal.ProductRoot;
import org.springframework.stereotype.Repository;

/**
 * 商品聚合仓储.
 *
 * @author xuchao
 * @date 2022 -07-21 15:12:23
 */
public interface ProductRepository {
    /**
     * 根据商品id获取商品聚合信息.
     *
     * @param productId the product id
     * @return the product root
     */
    ProductRoot getProductById(String productId);
}
