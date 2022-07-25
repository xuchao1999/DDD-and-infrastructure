package com.example.nacosclient.infrastract.exception;

import com.example.nacosclient.infrastract.common.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * The type Unified exception handler.
 *
 * @author xuchao
 * @date 2022 -07-19 15:25:32
 */
@Slf4j
@Component
@ControllerAdvice
public class UnifiedExceptionHandler {

    /**
     * 业务异常
     *
     * @param e 异常
     * @return 异常结果 common result
     */
    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public CommonResult handleBusinessException(BaseException e) {
        log.error("业务异常-----" + "code: " + e.getCode() + "; message: " + e.getMessage());
        return CommonResult.error(e);
    }
}
