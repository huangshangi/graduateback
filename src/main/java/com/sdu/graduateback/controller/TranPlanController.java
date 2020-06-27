/*
 * Copyright (c) 2020
 * Date:2020/06/16 15:09:16
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.controller;

import com.sdu.graduateback.dto.Graduate;
import com.sdu.graduateback.dto.Result;
import com.sdu.graduateback.dto.Student;
import com.sdu.graduateback.dto.TranPlan;
import com.sdu.graduateback.service.GraduateService;
import com.sdu.graduateback.service.StudentService;
import com.sdu.graduateback.service.TranPlanService;
import com.sdu.graduateback.service.UserService;
import com.sdu.graduateback.utils.ErrorUtil;
import com.sdu.graduateback.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class TranPlanController {

    @Autowired
    UserService userService;
    @Autowired
    TranPlanService tranPlanService;
    @Autowired
    StudentService studentService;
    @Autowired
    GraduateService graduateService;

    @RequestMapping(value = "/tranplan",method = RequestMethod.POST)
    @ResponseBody
    public Result tranplan(@RequestBody Graduate graduate){
        String token=graduate.getToken();
        HashMap<String,Object>map=new HashMap<>();

        if(StringUtil.isEmpty(token))
            return ErrorUtil.getErrorReport("参数错误");

        String teacherId=userService.getIdByToken(token);

        if(StringUtil.graduateSelect(graduate)){

            List<TranPlan>list=tranPlanService.getTranPlans(teacherId);
            Object obj=tranPlanService.convertTranPlanToJson(list);
            map.put("result",obj);

            return new Result("success",null,obj);

        }else{
            if(StringUtil.isEmpty(graduate.getO())){
                map.put("result",tranPlanService.getTranPlanById(graduate.getI()));
                return new Result("success",null,tranPlanService.getTranPlanById(graduate.getI()));
            }


            //更新
            if(graduateService.updateGraduateByTType(graduate.getI(),graduate.getO())==1)
                return new Result("success",null,null);
            else
                return ErrorUtil.getErrorReport("参数错误");
        }


    }

}
