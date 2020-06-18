/*
 * Copyright (c) 2020
 * Date:2020/06/18 18:04:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.mapper;

import com.sdu.graduateback.dto.Student;

import java.util.List;

public interface StudentMapper {

    List<Student>getStudentsByTeacherId(String teacherId);

}
