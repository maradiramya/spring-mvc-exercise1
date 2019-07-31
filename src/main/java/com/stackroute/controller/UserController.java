package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //Controller annotation can be applied on classes only. It’s used to mark a class as a web request handler
public class UserController
{
    @RequestMapping("/") //This annotation maps HTTP requests to handler methods of MVC
                         //annotation is used to map Spring MVC controller methods.
    public ModelAndView modelAndView()
    {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("result","ramya");
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
