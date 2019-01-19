package com.test.ssm.common;

import lombok.Data;

/**
 * @Author: 72038667
 * @Date: 2019/1/18 14:49
 * @Version: 1.0
 */
@Data
public class Result <T>{

    private Integer code;

    private String msg;

    private T data;
}
