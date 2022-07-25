package com.example.nacosclient.infrastract.external;

import com.example.nacosclient.application.ExternalService.InventoryService;
import org.springframework.stereotype.Service;

/**
 * The type Inventory service.
 *
 * @author xuchao
 * @date 2022 -07-22 15:32:05
 */
@Service
public class InventoryServiceImpl implements InventoryService {
    @Override
    public boolean withhold(String itemId, Integer quantity) {
        return false;
    }
}
