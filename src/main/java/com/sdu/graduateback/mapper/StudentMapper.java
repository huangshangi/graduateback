/*
 * Copyright (c) 2020
 * Date:2020/06/18 18:04:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.mapper;

import com.sdu.graduateback.dto.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StudentMapper {

    List<Student>getStudentsByTeacherId(String teacherId);
    Student getStudentById(String id);//这里如果你要老师的id改一下就好
    int addStudent(Student student);


    int deleteStudent(Student student);
    int updateStudent(Student student);

}
