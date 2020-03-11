package com.mvc.controller;

import com.mvc.annotation.MyController;
import com.mvc.annotation.MyRequestMapping;
import com.mvc.annotation.MyRequestParam;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @ClassName TestController
 * @Description 测试类
 * @Author 戴书博
 * @Date 2020/3/11 16:53
 * @Version 1.0
 **/
@MyController
@MyRequestMapping("/test")
public class TestController {

    @MyRequestMapping("/index")
    public void test1(HttpServletRequest request, HttpServletResponse response,
                      @MyRequestParam("param") String param){
        System.out.println(param);
        try {
            response.getWriter().write( "doTest method success! param:"+param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @MyRequestMapping("/login")
    public void test2(HttpServletRequest request, HttpServletResponse response){
        try {
            response.getWriter().println("return login html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
