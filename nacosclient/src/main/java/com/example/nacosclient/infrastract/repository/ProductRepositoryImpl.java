package com.example.nacosclient.infrastract.repository;

import com.example.nacosclient.domain.product.modal.ProductRoot;
import com.example.nacosclient.domain.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

/**
 * The type Product repository.
 *
 * @author xuchao
 * @date 2022 -07-22 15:29:06
 */
@Service
public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public ProductRoot getProductById(String productId) {
        return null;
    }
}
