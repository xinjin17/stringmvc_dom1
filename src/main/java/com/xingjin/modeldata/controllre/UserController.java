package com.xingjin.modeldata.controllre;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/user")
public class UserController {


    // 用户登录
    @GetMapping("/login")
    public void login() {
//        return "";
        System.out.println("niaho");
    }

}
