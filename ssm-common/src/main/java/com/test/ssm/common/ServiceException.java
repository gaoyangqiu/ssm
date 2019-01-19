package com.test.ssm.common;


import lombok.Data;

/**
 * @Author: 72038667
 * @Date: 2019/1/18 15:16
 * @Version: 1.0
 */
@Data
public class ServiceException  extends RuntimeException {


    private Integer code;

    private String msg;


    public ServiceException( Integer code,String msg){
        super(msg);
        this.code=code;
        this.msg=msg;
    }

    public ServiceException(String msg){
        super(msg);
        this.msg=msg;
    }

}
