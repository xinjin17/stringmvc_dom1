package com.xingjin.modeldata.controllre;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/user")
public class UserController {


    // 用户登录
    @GetMapping("/login")
    public void login() {
//        return "";
        System.out.println("niaho");
    }

}
