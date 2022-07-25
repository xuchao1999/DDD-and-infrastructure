package com.example.nacosclient.application.dto.res;

import lombok.Data;

/**
 * The type Addr dto.
 *
 * @author xuchao
 * @date 2022 -07-21 14:21:46
 */
@Data
public class AddrDTO {
    /**
     * 姓名
     */
    private String name;
    /**
     * 电话
     */
    private String phone;
    /**
     * 地址详情
     */
    private String address;
}
