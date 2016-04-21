package com.zhuoyue.firstTest.controller;

import com.zhuoyue.firstTest.model.Behave;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.enterprise.inject.Model;

/**
 * Created by Administrator on 2016/4/21.
 */
@Controller
@RequestMapping("/user/")
public class UserController {
    @ResponseBody
    @RequestMapping(value = "like",method = RequestMethod.POST)
    public Object like(Behave behave){
        System.out.println(behave.getLike());
        return behave;
    }
}
