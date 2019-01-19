package com.test.ssm.controller;


import com.test.ssm.common.ResultCodeConstant;
import com.test.ssm.common.ServiceException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 72038667
 * @Date: 2019/1/17 11:33
 * @Version: 1.0
 */

@Controller
@RequestMapping("/test")
public class TestController {


    @RequestMapping("/test.do")
    public String returnExceptionInfo(){
        return "test";
    }

    @RequestMapping("/index.do")
    public String returnIndexInfo(){
        return "index";
    }


}



