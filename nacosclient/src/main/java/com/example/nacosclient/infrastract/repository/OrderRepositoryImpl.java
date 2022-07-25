package com.example.nacosclient.infrastract.repository;

import com.example.nacosclient.domain.order.modal.OrderRoot;
import com.example.nacosclient.domain.order.repository.OrderRepository;
import org.springframework.stereotype.Service;

/**
 * The type Order repository.
 *
 * @author xuchao
 * @date 2022 -07-22 15:29:00
 */
@Service
public class OrderRepositoryImpl implements OrderRepository {
    @Override
    public boolean save(OrderRoot orderRoot) {
        return false;
    }
}
