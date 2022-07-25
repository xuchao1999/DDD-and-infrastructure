package com.example.nacosclient.domain.order.repository;

import com.example.nacosclient.domain.order.modal.OrderRoot;
import org.springframework.stereotype.Repository;

/**
 * The interface Order repository.
 *
 * @author xuchao
 * @date 2022 -07-21 13:57:41
 */
public interface OrderRepository {
    /**
     * 持久化订单信息
     *
     * @param orderRoot the order root
     * @return the boolean
     */
    boolean save(OrderRoot orderRoot);
}
