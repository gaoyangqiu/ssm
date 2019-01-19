package com.test.ssm.common;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Author: 72038667
 * @Date: 2019/1/18 16:07
 * @Version: 1.0
 */
@ControllerAdvice
public class GlobalExceptionResolver {

    private static final Logger LOG=Logger.getLogger(GlobalExceptionResolver.class);


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handleException(Exception e) {
        LOG.info(e.getMessage(),e);
        return ResultUtil.error(ResultCodeConstant.UNKNOW_ERROR_CODE,e.getMessage());
    }

    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public Result serviceException(ServiceException serviceException){
        LOG.info(serviceException.getMessage());
        return ResultUtil.error(ResultCodeConstant.SERVICE_ERROR_CODE, serviceException.getMsg());
    }
}
