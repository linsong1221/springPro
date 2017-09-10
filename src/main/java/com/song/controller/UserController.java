package com.song.controller;

import com.song.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.enterprise.inject.Model;
import java.util.Arrays;
import java.util.Map;

//@SessionAttributes(value={"user"},types = {String.class})   如果下面没有ModelAttribute 并且 value={"user"},跟下面 目标方法User 第一个字母小写一致则抛异常
//                                                            两种方法，要么在目标方法入参前面注解@ModelAttribute("abc") abc跟user不一致
//                                                            要么单独在上面在写一个@ModdleAttribute注解方法

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

//    Map
    @RequestMapping(value = "/testMap")
    public ModelAndView testMap(Map<String ,Object> map){
        String viewName = SUCCESS;
        ModelAndView modelAndView = new ModelAndView(viewName);
        map.put("names", Arrays.asList("linsong","hahahah","hehehe"));
        return modelAndView;
    }

//    modelAttribute

    @ModelAttribute
    public void isModelAttribute(@RequestParam(value = "id",required = false) Integer id,
                                 Map<String,Object> map){
        if(id!=null){
            User user = new User(1,"linsong","123456",24);
            System.out.println("从数据库获取的对象....."+user);
            map.put("abc",user);
        }
    }

//    上面的abc如果写成 User类 第一个字母小写 abc 则下面@ModelAttribute("abc")可以不用写，
// 如果上面是abc而下面@ModelAttribute("abc")没写则在success.jsp中存在两种User对象
    @RequestMapping(value = "/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user){
        System.out.println("修改"+user);
        return SUCCESS;
    }


}
