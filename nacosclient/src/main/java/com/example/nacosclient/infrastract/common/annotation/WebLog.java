package com.example.nacosclient.infrastract.common.annotation;

import java.lang.annotation.*;

/**
 * 入参日志打印注解.
 * Retention: 运行时使用该注解
 * Target: 标注使用地方（在方法上使用）
 * Documented：包含在javadoc中
 * @author xuchao
 * @date 2022 -07-19 16:28:42
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface WebLog {
    /**
     * Description string.
     *
     * @return the string
     */
    String description() default "";
}
