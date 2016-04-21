package com.zhuoyue.firstTest.controller;

import com.zhuoyue.firstTest.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2016/4/21.
 */
@Controller
public class LoginController {
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(User user){
        System.out.println(user);
        return "loginsucess";
    }
}
