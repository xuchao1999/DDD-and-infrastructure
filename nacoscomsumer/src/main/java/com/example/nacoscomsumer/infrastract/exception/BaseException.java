package com.example.nacoscomsumer.infrastract.exception;


import lombok.Data;

/**
 * 基础异常类
 *
 * @author xuchao
 * @date 2022 -07-19 14:02:34
 */
@Data
public class BaseException extends RuntimeException {
    // 异常码
    private String code;
    // 异常信息
    private String message;
    // 异常枚举
    private ExceptionEnumInterface iExceptionEnumInterface;

    /**
     * Instantiates a new Base exception.
     *
     * @param e the e
     */
    public BaseException(BusinessException e) {
        super(e);
    }

    /**
     * Instantiates a new Base exception.
     *
     * @param iExceptionEnumInterface the exception enum
     * @param objects                 the objects
     * @param message                 the message
     */
    public BaseException(ExceptionEnumInterface iExceptionEnumInterface, Object[] objects, String message) {
        this.iExceptionEnumInterface = iExceptionEnumInterface;
        this.message = message;
        this.code = iExceptionEnumInterface.getCode() + "";
    }

    /**
     * Instantiates a new Base exception.
     *
     * @param iExceptionEnumInterface the exception enum
     * @param objects                 the objects
     * @param message                 the message
     * @param throwable               the throwable
     */
    public BaseException(ExceptionEnumInterface iExceptionEnumInterface, Object[] objects, String message, Throwable throwable) {
        this.iExceptionEnumInterface = iExceptionEnumInterface;
        this.code = iExceptionEnumInterface.getCode() + "";
        this.message = message;
    }
}
