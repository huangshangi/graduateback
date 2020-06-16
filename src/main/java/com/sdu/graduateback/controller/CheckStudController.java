/*
 * Copyright (c) 2020
 * Date:2020/06/16 13:53:16
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.controller;

import com.sdu.graduateback.dto.Result;
import com.sdu.graduateback.dto.Student;
import com.sdu.graduateback.dto.StudentInfo;
import com.sdu.graduateback.service.StudentService;
import com.sdu.graduateback.service.UserService;
import com.sdu.graduateback.utils.ErrorUtil;
import com.sdu.graduateback.utils.StringUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class CheckStudController {

    StudentService studentService;

    UserService userService;

    @RequestMapping(value = "/checkstud",method = RequestMethod.POST)
    @ResponseBody
    public Result checkstud(@RequestBody StudentInfo studentInfo){
        String token=studentInfo.getToken();
        String i=studentInfo.getI();
        String teacherId=userService.getIdByToken(token);

        if(StringUtil.isEmpty(token)||StringUtil.isEmpty(teacherId))
            return ErrorUtil.getErrorReport("参数错误");


        if(StringUtil.isEmpty(i)){
            //查询所有学生操作

            List<Student> list=studentService.getStudentListByTeacherId(teacherId);

            //组装操作未实现

            return null;
        }else{
            //查询单个学生信息
            Student student=studentService.getStudentById(i);

            return null;
        }




    }

}
