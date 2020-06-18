/*
 * Copyright (c) 2020
 * Date:2020/06/16 13:21:16
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service;

import com.sdu.graduateback.dto.Graduate;
import com.sdu.graduateback.dto.Student;
import com.sdu.graduateback.dto.Thesis;

import java.util.List;

public interface GraduateService {

    int addGraduate(Graduate graduate);

    int deleteGraduate(Graduate graduate);

    int updateGraduate(Graduate graduate);

    int updateGraduateByGType(String id,String type,String value);

    int updateGraduateByAType(String id,String type,String value);

    int updateGraduateByTType(String id,String value);

    List<Student> getStudentsApp(String teacherId);

    Object convertStudentsJson(List<Student>list);

    Object convertThesissJson(List<Thesis>list);
}
