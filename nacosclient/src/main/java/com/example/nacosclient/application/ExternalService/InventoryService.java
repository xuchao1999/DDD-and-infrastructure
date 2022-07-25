package com.example.nacosclient.application.ExternalService;


/**
 * 外部服务：库存服务
 *
 * @author xuchao
 * @date 2022 -07-21 15:23:08
 */
public interface InventoryService {
    /**
     * 库存校验
     *
     * @param itemId   the item id
     * @param quantity the quantity
     * @return the boolean
     */
    boolean withhold(String itemId, Integer quantity);
}
