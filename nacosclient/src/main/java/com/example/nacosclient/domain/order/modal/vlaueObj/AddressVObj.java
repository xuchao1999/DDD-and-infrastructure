package com.example.nacosclient.domain.order.modal.vlaueObj;

import com.example.nacosclient.infrastract.common.enums.ParamExceptionEnum;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * 地址值对象
 *
 * @author xuchao
 * @date 2022 -07-20 10:15:00
 */
@Data
public class AddressVObj {
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

    /**
     * Instantiates a new Address v obj.
     *
     * @param name    the name
     * @param phone   the phone
     * @param address the address
     * @throws Exception the exception
     */
    public AddressVObj(String name, String phone, String address){
        // 姓名不能为空
        ParamExceptionEnum.NAME_NOT_NULL.assertIsFalse(StringUtils.isNoneBlank(name));
        // 电话不能为空
        ParamExceptionEnum.PHONE_NOT_NULL.assertIsFalse(StringUtils.isNoneBlank(phone));
        // 地址详情不能为空
        ParamExceptionEnum.ADDRESS_NOT_NULL.assertIsFalse(StringUtils.isNoneBlank(address));

        this.name = name;
        this.phone = phone;
        this.address = address;
    }
}
