/*
 * Copyright (c) 2020
 * Date:2020/06/27 14:14:27
 * Author:huangshangi
 * explain:模拟学生端申请信息
 *
 */

package com.sdu.graduateback.controller;

import com.sdu.graduateback.dto.Result;
import com.sdu.graduateback.dto.Student;
import com.sdu.graduateback.dto.Thesis;
import com.sdu.graduateback.dto.TranPlan;
import com.sdu.graduateback.service.*;
import com.sdu.graduateback.utils.ErrorUtil;
import com.sdu.graduateback.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {

    @Autowired
    GraduateService graduateService;

    @Autowired
    StudentService studentService;

    @Autowired
    UserService userService;

    @Autowired
    ThesisService thesisService;

    @Autowired
    TranPlanService tranPlanService;


    @RequestMapping(value = "/appliThe",method = RequestMethod.POST)
    @ResponseBody
    public Result application(@RequestBody Thesis thesis){
        String token=thesis.getToken();
        if(StringUtil.isEmpty(token))
            return ErrorUtil.getErrorReport("请检查登录状态");
        String type=thesis.getType();
        String i=userService.getIdByToken(token);

        if(graduateService.updateGraduateByGType(i,type,"3")==1)
            return new Result("success",null,null);
        else
            return ErrorUtil.getErrorReport("参数错误");




    }


    @RequestMapping(value = "/appliAbr",method = RequestMethod.POST)
    @ResponseBody
    public Result appliAbro(@RequestBody Thesis thesis){
        String token=thesis.getToken();
        if(StringUtil.isEmpty(token))
            return ErrorUtil.getErrorReport("请检查登录状态");
        String type=thesis.getType();
        String i=userService.getIdByToken(token);


        if(graduateService.updateGraduateByAType(i,type,"3")==1)
            return new Result("success",null,null);
        else
            return ErrorUtil.getErrorReport("参数错误");


    }

    @RequestMapping(value = "/appliPlan",method = RequestMethod.POST)
    @ResponseBody
    public Result appliPlan(@RequestBody TranPlan tranPlan){
        String token=tranPlan.getToken();
        if(StringUtil.isEmpty(token))
            return ErrorUtil.getErrorReport("请检查登录状态");
        String i=userService.getIdByToken(token);

        if(StringUtil.tranSele(tranPlan)){
            //查询
            return new Result("success",null,tranPlanService.getTranPlanById(i));
        }else{
            Student student=studentService.getStudentById(i);

            tranPlan.setName(student.getN());
            tranPlan.setI(student.getI());
            System.out.println(tranPlan);
            if(tranPlanService.addTranPlan(tranPlan)==1)
                return new Result("success",null,null);
            else
                return ErrorUtil.getErrorReport("参数错误");
        }



    }

    @RequestMapping(value = "/submitThesis",method = RequestMethod.POST)
    @ResponseBody
    public Result submitThesis(@RequestBody Thesis thesis){

        String token=thesis.getToken();
        if(StringUtil.isEmpty(token))
            return ErrorUtil.getErrorReport("请检查登录状态");


        if(thesisService.addThesis(thesis)==1)
            return new Result("success",null,null);
        else
            return ErrorUtil.getErrorReport("参数错误");

    }

}
