package com.example.nacosclient.application.commandService;


import com.example.nacosclient.application.dto.res.OrderDTO;
import com.example.nacosclient.application.dto.req.command.CheckoutCommond;

import javax.validation.Valid;
import java.util.List;

/**
 * 订单服务.
 *
 * @author xuchao
 * @date 2022 -07-21 14:26:35
 */
public interface CheckoutService {
    /**
     * 下单
     * @param cmd the cmd
     * @return the order dto
     */
    OrderDTO checkout(@Valid CheckoutCommond cmd);
}
