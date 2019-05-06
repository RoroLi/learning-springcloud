package com.roro.msconsumertimeoutdemo.handler;

import com.roro.msconsumertimeoutdemo.entity.UserInfoVo;
import com.roro.msconsumertimeoutdemo.exception.MyTimeoutException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyExcpetionHandler {

    @ExceptionHandler(value = MyTimeoutException.class)
    @ResponseBody
    public Object dealException() {
//        UserInfoVo userInfoVo = new UserInfoVo();
//        userInfoVo.setUserName("容错用户");
//        userInfoVo.setOrderVoList(null);
//        return userInfoVo;
        return "统一的超时异常";
    }
}
