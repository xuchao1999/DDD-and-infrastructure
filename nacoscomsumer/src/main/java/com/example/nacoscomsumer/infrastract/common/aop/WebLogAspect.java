package com.example.nacoscomsumer.infrastract.common.aop;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * web日志切面.
 *
 * @author xuchao
 * @date 2022 -07-19 17:12:50
 */
@Slf4j
@Aspect
@Component
public class WebLogAspect {


    /**
     * The constant LINE_SEPARATOR.
     */
    private static final String LINE_SEPARATOR = System.lineSeparator();
    private static final long DANGERS_TIME = 4;

    /**
     * Web log.
     */
    @Pointcut("@annotation(com.example.nacosclient.infrastract.common.annotation.WebLog)")
    public void webLog(){};

    /**
     * Do around object.
     *
     * @param proceedingJoinPoint the proceeding join point
     * @return the object
     * @throws Throwable the throwable
     */
    @Around("webLog()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // 记录运行时间
        long startTime = System.currentTimeMillis();
        // 运行业务逻辑
        Object result = proceedingJoinPoint.proceed();
        // 打印返回参数
        log.info("Response args : {}", new Gson().toJson(result));
        // 执行耗时
        if (System.currentTimeMillis() - startTime > DANGERS_TIME) {
            log.warn("Time-consuming : {}", System.currentTimeMillis() - startTime);
        } else {
            log.info("Time-consuming : {}", System.currentTimeMillis() - startTime);
        }
        return result;
    }

    /**
     * Do before.
     *
     * @param joinPoint the join point
     * @throws Throwable the throwable
     */
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        // 打印请求日志
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 获取 weblog 注解描述信息
//        String methodDescription = getAspectLogDescription(joinpoint);

        // 打印请求参数
        log.info("============================start==========================");
        // 打印请求url
        log.info("url                   : {}", request.getRequestURL().toString());
        // 打印方法信息
        log.info("http method           : {}", request.getMethod());
        // 打印调用controller 的全部路径及执行方法
        log.info("class method          : {}, {}", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
        // 打印请求ip
        log.info("ip                    : {}", request.getRemoteAddr());
        // 打印请求入参
        log.info("request args          : {}", new Gson().toJson(joinPoint.getArgs()));
    }

    /**
     * Do after.
     *
     * @throws Throwable the throwable
     */
    @After("webLog()")
    public void doAfter() throws Throwable {
        log.info("=============================end===========================" + LINE_SEPARATOR);
    }
}
