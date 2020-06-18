/*
 * Copyright (c) 2020
 * Date:2020/06/17 16:36:17
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service.impl;

import com.sdu.graduateback.dto.Graduate;
import com.sdu.graduateback.dto.Student;
import com.sdu.graduateback.mapper.GraduateMapper;
import com.sdu.graduateback.mapper.StudentMapper;
import com.sdu.graduateback.mapper.TeacherMapper;
import com.sdu.graduateback.service.GraduateService;
import com.sdu.graduateback.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraduateServiceImpl implements GraduateService {

    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    GraduateMapper graduateMapper;

    @Override
    public int addGraduate(Graduate graduate) {
        return 0;
    }

    @Override
    public int deleteGraduate(Graduate graduate) {
        return 0;
    }

    @Override
    public int updateGraduate(Graduate graduate) {
        return 0;
    }

    @Override
    public int updateGraduateByType(String type, String value) {
        return 0;
    }

    @Override
    public List<Student> getStudentsApp(String teacherId) {
        List<Student>res=new ArrayList<>();

        List<Student>list=studentMapper.getStudentsByTeacherId(teacherId);

        for(Student student:list){
            Graduate graduate=graduateMapper.getGraduateById(student.getI());
            if(!StringUtil.isEmpty(graduate.getGa())&&!graduate.getGa().equals("0")){
                student.setStatus(graduate.getGa());
                res.add(student);
            }

        }

        return res;
    }

    @Override
    public Object convertStudentsJson(List<Student> list) {
        Map<String,Object> map=new HashMap<>();
        List<Student>cl=new ArrayList<>();
        List<Student>ucl=new ArrayList<>();

        for(Student student:list){
            if(student.getStatus().equals("1"))
                ucl.add(student);
            else
                cl.add(student);
        }
        map.put("cl",cl);
        map.put("ucl",ucl);

        return map;
    }
}
