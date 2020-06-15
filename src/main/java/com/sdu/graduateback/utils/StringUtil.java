/*
 * Copyright (c) 2020
 * Date:2020/06/12 09:45:12
 * Author:huangshangi
 * explain:字符串操作工具类
 *
 */

package com.sdu.graduateback.utils;

import com.sdu.graduateback.dto.RecuritQualification;
import com.sdu.graduateback.dto.Teacher;

public class StringUtil {

    public static boolean isEmpty(String s){

        return s==null||s.isEmpty();
    }


    public static boolean teacherSelect(Teacher teacher){


        return isEmpty(teacher.getAward())&&isEmpty(teacher.getDirction())&&isEmpty(teacher.getEduback())
                &&isEmpty(teacher.getGender())&&isEmpty(teacher.getRank());


    }

    public static boolean recuritQualiSelect(RecuritQualification obj){

        return false;

    }
}
