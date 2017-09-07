package com.song.controller;

import com.song.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

//    private IUserService userService;

    @RequestMapping("/bbb")
    public String toIndex(){
        System.out.println("show User");
        return "success";
    }
}
