/*
 * Copyright (c) 2020
 * Date:2020/06/12 11:16:12
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.mapper;

import com.sdu.graduateback.dto.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {

    Teacher getTeacherById(String id);

    int updateTeacher(Teacher teacher);
}
