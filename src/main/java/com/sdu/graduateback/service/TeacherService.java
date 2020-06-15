/*
 * Copyright (c) 2020
 * Date:2020/06/12 08:53:12
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service;

import com.sdu.graduateback.dto.Teacher;

public interface TeacherService {


    Teacher getTeacherById(String id);

    int updateTeacher(Teacher teacher,String id);

    Teacher teacherPack(Teacher oldT,Teacher newT);
}
