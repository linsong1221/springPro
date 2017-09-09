package com.song.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/aaa")
@Controller
public class UserController {

    @RequestMapping(value = "/bbb/{id}",method = RequestMethod.GET)
    public String toIndex(@PathVariable("id") Integer id){
        System.out.println("show User");
        System.out.println(id);
        return "success";
    }

    @RequestMapping(value="/restPut/{id}",method = RequestMethod.PUT)
    public String restput(@PathVariable Integer id){
        System.out.println(id);
        return "success";
    }
}
