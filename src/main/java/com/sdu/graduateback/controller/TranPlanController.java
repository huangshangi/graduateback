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
import com.sdu.graduateback.service.StudentService;
import com.sdu.graduateback.service.TranPlanService;
import com.sdu.graduateback.service.UserService;
import com.sdu.graduateback.utils.ErrorUtil;
import com.sdu.graduateback.utils.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TranPlanController {

    UserService userService;

    TranPlanService tranPlanService;

    StudentService studentService;

    @RequestMapping(value = "/tranplan",method = RequestMethod.POST)
    @ResponseBody
    public Result tranplan(@RequestBody Graduate graduate){
        String token=graduate.getToken();

        if(StringUtil.isEmpty(token))
            return ErrorUtil.getErrorReport("参数错误");

        String teacherId=userService.getIdByToken(token);

        if(StringUtil.graduateSelect(graduate)){
            //查询操作
            //获取该导师所有学生
            List<Student> list=studentService.getStudentListByTeacherId(teacherId);

            //根据学生id查询培养计划信息

            //根据学生id查询审核状态
        }else{
            //更新

        }

        return null;

    }

}
