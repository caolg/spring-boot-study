package com.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        return "hello world!!";
    }

    public static void main(String[] args) {
        System.out.println("hello world!!");
    }
}
