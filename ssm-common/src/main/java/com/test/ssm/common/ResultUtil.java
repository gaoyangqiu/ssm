package com.test.ssm.common;

/**
 * @Author: 72038667
 * @Date: 2019/1/18 14:52
 * @Version: 1.0
 */
public class ResultUtil {

    public static Result success(Object object){
        Result result=new Result();
        result.setCode(ResultCodeConstant.SUCCESS_CODE);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }
    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String msg){
        Result result=new Result();
        result.setCode(code);
        result.setMsg(msg);
        return  result;
    }

}
