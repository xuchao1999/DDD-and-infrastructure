package com.example.nacosclient.infrastract.exception;

/**
 * The type Business exception.
 *
 * @author xuchao
 * @date 2022 -07-19 15:21:24
 */
public class BusinessException extends BaseException {
    /**
     * Instantiates a new Business exception.
     *
     * @param exceptionEnumInterface the exception enum interface
     * @param objects                the objects
     * @param message                the message
     */
    public BusinessException(ExceptionEnumInterface exceptionEnumInterface, Object[] objects , String message) {
        super(exceptionEnumInterface,objects,message);
    }

    /**
     * Instantiates a new Business exception.
     *
     * @param responseEnum the response enum
     * @param args         the args
     * @param message      the message
     * @param cause        the cause
     */
    public BusinessException(ExceptionEnumInterface responseEnum, Object[] args, String message, Throwable cause) {
        super(responseEnum, args, message, cause);
    }
}
