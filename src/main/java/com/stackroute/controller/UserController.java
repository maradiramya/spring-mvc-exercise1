package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController
{
    @RequestMapping("/")
    public ModelAndView modelAndView()
    {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("result","ramya");
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
