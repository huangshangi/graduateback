/*
 * Copyright (c) 2020
 * Date:2020/06/18 19:58:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service.impl;

import com.sdu.graduateback.dto.GoAbroad;
import com.sdu.graduateback.dto.Graduate;
import com.sdu.graduateback.dto.Student;
import com.sdu.graduateback.mapper.GoAbroadMapper;
import com.sdu.graduateback.mapper.GraduateMapper;
import com.sdu.graduateback.mapper.StudentMapper;
import com.sdu.graduateback.service.GoAbroadService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoAbroadServiceImpl implements GoAbroadService {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    GraduateMapper graduateMapper;

    @Autowired
    GoAbroadMapper goAbroadMapper;

    @Override
    public List<GoAbroad> getGoAbroads(String type, String teacherId) {

        //获取该导师所有学生
        List<Student> list=studentMapper.getStudentsByTeacherId(teacherId);
        List<GoAbroad>res=new ArrayList<>();
        for(Student student:list){
            Graduate graduate=graduateMapper.getGraduateById(student.getI());
            GoAbroad goAbroad=goAbroadMapper.getGoAbroadById(student.getI());

            if(type.equals("0")&&!graduate.getTa().equals("0")){
                goAbroad.setType(type);
                goAbroad.setStatus(graduate.getTa());
            }else if(type.equals("1")&&!graduate.getNa().equals("0")){
                goAbroad.setType(type);
                goAbroad.setStatus(graduate.getNa());
            }else if(type.equals("2")&&!graduate.getGba().equals("0")){
                goAbroad.setType(type);
                goAbroad.setStatus(graduate.getGba());
            }else if(type.equals("3")&&!graduate.getBa().equals("0")){
                goAbroad.setType(type);
                goAbroad.setStatus(graduate.getBa());
            }else
                continue;

            res.add(goAbroad);


        }


        return res;
    }


    @Override
    public Object convertGoAbroadJson(List<GoAbroad> list) {

        Map<String,Object> map=new HashMap<>();

        List<GoAbroad>cl=new ArrayList<>();
        List<GoAbroad>ucl=new ArrayList<>();

        for(GoAbroad goAbroad:list){

            if(goAbroad.getStatus().equals("1"))
                ucl.add(goAbroad);
            else
                cl.add(goAbroad);


        }

        map.put("cl",cl);
        map.put("ucl",ucl);

        return map;
    }
}
