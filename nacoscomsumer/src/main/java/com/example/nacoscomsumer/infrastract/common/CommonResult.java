package com.example.nacoscomsumer.infrastract.common;


import com.example.nacoscomsumer.infrastract.exception.BaseException;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The type Common result.
 *
 * @param <T> the type parameter
 * @author xuchao
 * @date 2022 -07-19 15:27:43
 */
@Data
@AllArgsConstructor
public class CommonResult<T> {
    /**
     * 返回码.
     */
    private String code;
    /**
     * 返回信息.
     */
    private String msg;
    /**
     * 返回数据.
     */
    private T data;

    /**
     * Error common result.
     *
     * @return com.example.order.common.commonResult common result
     * @Author Chao Xu
     * @Description 异常结果
     * @Date 12 :56 2022/5/6
     * @Param [e]
     */
    public static CommonResult error(){
        return new CommonResult("10000", "失败", null);
    }

    /**
     * Error common result.
     *
     * @param e the e
     * @return com.example.order.common.commonResult common result
     * @Author Chao Xu
     * @Description 异常结果
     * @Date 12 :56 2022/5/6
     * @Param [e]
     */
    public static CommonResult error(BaseException e){
        return new CommonResult(e.getCode(), e.getMessage(), null);
    }

    /**
     * Success common result.
     *
     * @return com.example.order.common.commonResult common result
     * @Author Chao Xu
     * @Description 返回成功 （无返回数据）
     * @Date 13 :00 2022/5/6
     * @Param []
     */
    public static CommonResult success(){
        return new CommonResult("200", "返回成功", null);
    }

    /**
     * Success common result.
     *
     * @param <T>  the type parameter
     * @param data the data
     * @return com.example.order.common.commonResult common result
     * @Author Chao Xu
     * @Description 返回成功 （有返回数据）
     * @Date 13 :01 2022/5/6
     * @Param [data]
     */
    public static <T> CommonResult success(T data){
        return new CommonResult("200", "返回成功", data);
    }
}
