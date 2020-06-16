/*
 * Copyright (c) 2020
 * Date:2020/06/16 13:50:16
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service;

import com.sdu.graduateback.dto.Student;

import java.util.List;

public interface StudentService {

    int addStudent(Student student);


    int deleteStudent(Student student);

    Student getStudentById(String id);


    int updateStudent(Student student);


    List<Student> getStudentListByTeacherId(String teacherId);

}
