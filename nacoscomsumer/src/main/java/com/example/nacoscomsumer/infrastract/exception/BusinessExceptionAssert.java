package com.example.nacoscomsumer.infrastract.exception;

import java.text.MessageFormat;

/**
 * 业务异常接口.
 *
 * @author xuchao
 * @date 2022 -07-19 14:03:59
 */
public interface BusinessExceptionAssert extends IAssert, ExceptionEnumInterface {
    @Override
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new BusinessException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable t, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new BusinessException(this, args, msg, t);
    }
}
