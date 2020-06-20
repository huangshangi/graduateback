/*
 * Copyright (c) 2020
 * Date:2020/06/16 13:50:16
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service;

import com.sdu.graduateback.dto.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {

    int addStudent(Student student);


    int deleteStudent(Student student);

    Student getStudentById(String id);

    List<Student> getStudentListByTeacherId(String teacherId);

    int updateStudent(Student student);

}
