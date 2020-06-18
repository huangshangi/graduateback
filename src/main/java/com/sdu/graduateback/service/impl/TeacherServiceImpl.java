/*
 * Copyright (c) 2020
 * Date:2020/06/18 14:03:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service.impl;

import com.sdu.graduateback.dto.Teacher;
import com.sdu.graduateback.mapper.TeacherMapper;
import com.sdu.graduateback.service.TeacherService;
import com.sdu.graduateback.service.TeamService;
import com.sdu.graduateback.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;

public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public Teacher getTeacherById(String id) {
        return teacherMapper.getTeacherById(id);
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        return teacherMapper.updateTeacher(teacher);
    }

    @Override
    public Teacher teacherPack(Teacher oldT, Teacher newT) {

        if(!StringUtil.isEmpty(oldT.getAward()))
            newT.setAward(oldT.getAward());

        if(!StringUtil.isEmpty(oldT.getRank()))
            newT.setRank(oldT.getRank());

        if(!StringUtil.isEmpty(oldT.getGender()))
            newT.setGender(oldT.getGender());

        if(!StringUtil.isEmpty(oldT.getEduback()))
            newT.setEduback(oldT.getEduback());

        if(!StringUtil.isEmpty(oldT.getDirction()))
            newT.setDirction(oldT.getDirction());

        if(!StringUtil.isEmpty(oldT.getAge()))
            newT.setAge(oldT.getAge());
        return newT;
    }
}
