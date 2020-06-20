/*
 * Copyright (c) 2020
 * Date:2020/06/18 17:30:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service.impl;

import com.sdu.graduateback.dto.Graduate;
import com.sdu.graduateback.dto.Student;
import com.sdu.graduateback.dto.Thesis;
import com.sdu.graduateback.mapper.GraduateMapper;
import com.sdu.graduateback.mapper.StudentMapper;
import com.sdu.graduateback.mapper.ThesisMapper;
import com.sdu.graduateback.service.ThesisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ThesisServiceImpl implements ThesisService {

    @Autowired
    ThesisMapper thesisMapper;

    @Autowired
    GraduateMapper graduateMapper;

    @Autowired
    StudentMapper studentMapper;

    @Override
    public int addThesis(Thesis thesis) {
        return 0;
    }

    @Override
    public int deleteThesis(Thesis thesis) {
        return 0;
    }

    @Override
    public int updateThesis(Thesis thesis) {
        return 0;
    }

    @Override
    public List<Thesis> getThesisWai(String id) {
        return getThesis(id,"1");

    }

    public List<Thesis> getThesis(String id,String type){
        List<Student>students=studentMapper.getStudentsByTeacherId(id);
        List<Thesis>res=new ArrayList<>();

        for(Student student:students){
            Thesis thesis=thesisMapper.getThesisById(id);
            Graduate graduate=graduateMapper.getGraduateById(thesis.getI());

            if(type.equals("1")&&!graduate.getE().equals("0")){
                thesis.setType("1");
                thesis.setStatus(graduate.getE());
            }else if(type.equals("2")&&!graduate.getGp().equals("0")){
                thesis.setType("2");
                thesis.setStatus(graduate.getGp());
            }else{
                continue;
            }
            res.add(thesis);
        }


        return res;
    }


    @Override
    public List<Thesis> getThesisBi(String id) {
        return getThesis(id,"2");
    }



    @Override
    public Object thesisPack(List<Thesis> list) {

        Map<String,Object> map=new HashMap<>();

        return null;

    }
}
