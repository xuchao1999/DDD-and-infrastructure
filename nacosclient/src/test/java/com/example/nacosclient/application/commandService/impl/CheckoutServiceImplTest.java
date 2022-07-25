package com.example.nacosclient.application.commandService.impl;

import com.example.nacosclient.application.commandService.CheckoutService;
import com.example.nacosclient.application.dto.req.command.CheckoutCommond;
import com.example.nacosclient.application.dto.req.command.OrderItemInfo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest

class CheckoutServiceImplTest {
    @Resource
    private CheckoutService checkoutService;
    @Test
    void checkout() {

        OrderItemInfo orderItemInfo = new OrderItemInfo();
        orderItemInfo.setQuantity(1);


        CheckoutCommond checkoutCommond = new CheckoutCommond();
        checkoutCommond.setOrderItemInfoList(Arrays.asList(orderItemInfo));
        checkoutCommond.setTotalPrice(BigDecimal.ZERO);
        checkoutService.checkout(checkoutCommond);

    }
}