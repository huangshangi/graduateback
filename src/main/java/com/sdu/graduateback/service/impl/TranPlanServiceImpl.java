/*
 * Copyright (c) 2020
 * Date:2020/06/18 20:58:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service.impl;

import com.sdu.graduateback.dto.GoAbroad;
import com.sdu.graduateback.dto.Graduate;
import com.sdu.graduateback.dto.Student;
import com.sdu.graduateback.dto.TranPlan;
import com.sdu.graduateback.mapper.GraduateMapper;
import com.sdu.graduateback.mapper.StudentMapper;
import com.sdu.graduateback.mapper.TranPlanMapper;
import com.sdu.graduateback.service.TranPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class TranPlanServiceImpl implements TranPlanService {

    @Autowired
    TranPlanMapper tranPlanMapper;

    @Autowired
    GraduateMapper graduateMapper;

    @Autowired
    StudentMapper studentMapper;

    @Override
    public int addTranPlan(TranPlan tranPlan) {
        return 0;
    }

    @Override
    public int deleteTranPaln(TranPlan tranPlan) {
        return 0;
    }

    @Override
    public TranPlan getTranPlanById(String id) {
        return null;
    }

    @Override
    public List<TranPlan> getTranPlans(String teacherId) {

        List<Student>students=studentMapper.getStudentsByTeacherId(teacherId);
        List<TranPlan>res=new ArrayList<>();

        for(Student student:students){

            Graduate graduate=graduateMapper.getGraduateById(student.getI());
            TranPlan tranPlan=tranPlanMapper.getTranPlanById(student.getI());

            if(!graduate.getTpa().equals("0")){
                tranPlan.setStatus(graduate.getTpa());
                res.add(tranPlan);
            }




        }

        return res;
    }

    @Override
    public Object convertTranPlanToJson(List<TranPlan> list) {

        Map<String,Object> map=new HashMap<>();

        List<TranPlan>cl=new ArrayList<>();
        List<TranPlan>ucl=new ArrayList<>();

        for(TranPlan tranPlan:list){

            if(tranPlan.getStatus().equals("1"))
                ucl.add(tranPlan);
            else
                cl.add(tranPlan);


        }

        map.put("cl",cl);
        map.put("ucl",ucl);

        return map;
    }
}
