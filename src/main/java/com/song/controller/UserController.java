package com.song.controller;

import com.song.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/aaa")
@Controller
public class UserController {
    private static final String SUCCESS = "success";
//    正常RequestMapping的使用
    @RequestMapping(value = "/bbb")
    public String toIndex(){
        System.out.println("show User");
        return "success";
    }

//    restful风格的 @PathVariable传参
//    @RequestMapping(value="/restPut/{id}",method = RequestMethod.PUT)
//    public String testPut(@PathVariable("id") Integer id){
//        System.out.println(id);
//        return "success";
//    }
//    @RequestParam传参
    @RequestMapping(value = "/testParam")
    public String testParam(@RequestParam(value = "username") String username,@RequestParam(value = "password",required = false) Integer password){
        System.out.println(username+"......lkkk");
        return "success";
    }
//    测试PoJo类，支持级联属性
    @RequestMapping(value = "/testPojo")
    public String testPojo(User user){
        System.out.println(user);
        return "success";
    }
//    ModelAndView
    @RequestMapping(value = "/testModelAndView")
    public ModelAndView testModelANdView(){
        String viewName = SUCCESS;
        ModelAndView modelAndView = new ModelAndView(viewName);
//        添加模型数据到ModelAndView
        modelAndView.addObject("time","5555555");
        return modelAndView;
    }
}
