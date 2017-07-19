package com.lotus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/7/19.
 */
@Controller
//访问的url地址前缀，可以不写，写了就必须在方法url前面先加上class url 进行区分控制器
@RequestMapping(value = "/Test/*")
public class ControllerTest {

    //访问地址：http://localhost:8080/Test/returnSuccess
    @RequestMapping(value = "returnSuccess")
    public String returnSuccess() {
        return "Views/success";
    }

    //访问地址：http://localhost:8080/Test/returnString
    @RequestMapping(value = "returnString", produces = {"text/plain;charset=UTF-8"})
    @ResponseBody
    public String returnString() {
        return "hello return string 这是中文，并没有乱码";
    }

}
