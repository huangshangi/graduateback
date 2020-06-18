/*
 * Copyright (c) 2020
 * Date:2020/06/18 19:54:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service.impl;

import com.sdu.graduateback.dto.Student;
import com.sdu.graduateback.mapper.StudentMapper;
import com.sdu.graduateback.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public int addStudent(Student student) {
        return 0;
    }

    @Override
    public int deleteStudent(Student student) {
        return 0;
    }

    @Override
    public Student getStudentById(String id) {
        return null;
    }

    @Override
    public List<Student> getStudentListByTeacherId(String teacherId) {
        return studentMapper.getStudentsByTeacherId(teacherId);
    }

    @Override
    public int updateStudent(Student student) {
        return 0;
    }
}
