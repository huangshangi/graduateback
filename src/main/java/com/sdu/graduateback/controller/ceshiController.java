package com.sdu.graduateback.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ceshiController {

    @RequestMapping
    public String sayHello(){
        return "index";
    }

}
