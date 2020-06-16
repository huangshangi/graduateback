/*
 * Copyright (c) 2020
 * Date:2020/06/16 14:49:16
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.controller;


import com.sdu.graduateback.dto.Graduate;
import com.sdu.graduateback.dto.Result;
import com.sdu.graduateback.dto.Student;
import com.sdu.graduateback.service.StudentService;
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
public class GoAbroadController {

    UserService userService;

    StudentService studentService;

    @RequestMapping(value = "/abroeval",method = RequestMethod.POST)
    @ResponseBody
    public Result abroeval(@RequestBody Graduate graduate){

        String token=graduate.getToken();
        String teacherId=userService.getIdByToken(token);

        if(StringUtil.isEmpty(token))
            return ErrorUtil.getErrorReport("参数错误");


        if(StringUtil.graduateSelect(graduate)){
            //查询操作
            //获取该导师所有学生
            List<Student> list=studentService.getStudentListByTeacherId(teacherId);

            //根据学生id查询出国信息

            //根据学生id查询审核状态


        }


        return null;
    }

}
