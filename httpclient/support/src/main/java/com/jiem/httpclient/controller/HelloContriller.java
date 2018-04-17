package com.jiem.httpclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * spring mvc 测试类
 * Created by jiem on 2018/4/17.
 */
@Controller
@RequestMapping("/hello")
public class HelloContriller {

    @RequestMapping("/world")
    public String world(Model model){
        return "world";
    }


}
