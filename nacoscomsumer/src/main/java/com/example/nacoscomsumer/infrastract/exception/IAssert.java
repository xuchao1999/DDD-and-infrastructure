package com.example.nacoscomsumer.infrastract.exception;




/**
 * 自定义断言接口.
 *
 * @author xuchao
 * @date 2022 -07-19 13:55:00
 */
public interface IAssert {
    /**
     * 创建异常.
     *
     * @param args the args
     * @return the base exception
     */
    BaseException newException(Object... args);

    /**
     * 创建异常
     *
     * @param t    the t
     * @param args the args
     * @return the base exception
     */
    BaseException newException(Throwable t, Object... args);

    /**
     * 断言对象obj非空 。如果对象obj为空，则抛出异常.
     *
     * @param obj the obj
     */
    default void assertNotNull(Object obj) {
        if (obj == null) {
            throw newException(obj);
        }
    }

    /**
     * 断言对象obj是否为false.
     *
     * @param obj the obj
     */
    default void assertIsFalse(Object obj) {
        if (Boolean.FALSE.equals(obj)) {
            throw newException(obj);
        }
    }

    /**
     * 判断两个值是否相等
     *
     * @param a1 the a 1
     * @param a2 the a 2
     */
    default void notEquals(String a1, String a2) {
        assertNotNull(a1);
        if (a1 != a2 || a1.compareTo(a2) != 0) {
            throw newException(a1);
        }
    }
}