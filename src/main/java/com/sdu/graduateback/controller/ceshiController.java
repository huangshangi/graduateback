package com.sdu.graduateback.controller;

import com.sdu.graduateback.dto.Ceshi;
import com.sdu.graduateback.dto.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ceshiController {

    @RequestMapping(value = "/c",method = RequestMethod.POST)
    @ResponseBody
    public Result ceshi(@RequestParam(name = "s") String s){
        System.out.println("执行");
        //System.out.println(p+"   "+a);
        //Result result=new Result("success",null,p);

        return null;
    }

}
