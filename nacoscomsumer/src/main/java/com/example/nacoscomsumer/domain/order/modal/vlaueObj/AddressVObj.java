package com.example.nacoscomsumer.domain.order.modal.vlaueObj;

import lombok.Data;
import org.springframework.util.StringUtils;

/**
 * @ClassName: AddressVObj
 * @description: 地址值对象
 * @Author: Chao Xu
 * @Date: 2022/7/12 16:01
 **/
@Data
public class AddressVObj {
    // 姓名
    private String name;
    // 电话
    private String phone;
    // 地址详情
    private String address;

    public AddressVObj(String name, String phone, String address) throws Exception {
        if(null != name && null != phone && null != address){
            this.name = name;
            this.phone = phone;
            this.address = address;
        }else {
            // todo: 按照代码规范，是不应该出现硬编码的情况存在的，后续异常信息可以统一管理
            throw new Exception("参数错误");
        }
    }
}
