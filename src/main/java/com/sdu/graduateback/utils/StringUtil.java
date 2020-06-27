/*
 * Copyright (c) 2020
 * Date:2020/06/12 09:45:12
 * Author:huangshangi
 * explain:字符串操作工具类
 *
 */

package com.sdu.graduateback.utils;

import com.sdu.graduateback.dto.*;

public class StringUtil {

    public static boolean isEmpty(String s){

        return s==null||s.length()==0;
    }


    public static boolean teacherSelect(Teacher teacher){


        return isEmpty(teacher.getAward())&&isEmpty(teacher.getDirction())&&isEmpty(teacher.getEduback())
                &&isEmpty(teacher.getGender())&&isEmpty(teacher.getRank())&&isEmpty(teacher.getAge());


    }

    public static boolean recuritQualiSelect(RecuritQualification obj){

        return isEmpty(obj.getPc())&&isEmpty(obj.getBc())&&isEmpty(obj.getAc())&&isEmpty(obj.getIc())
                &&isEmpty(obj.getTc())&&isEmpty(obj.getDc())&&isEmpty(obj.getNc())&&isEmpty(obj.getNpc())
                &&isEmpty(obj.getPpc())&&isEmpty(obj.getCpc())&&isEmpty(obj.getDsc())&&isEmpty(obj.getMsc())
                &&isEmpty(obj.getHgdsc())&&isEmpty(obj.getT())&&isEmpty(obj.gettId())&&isEmpty(obj.getNppc());

    }


    public static boolean teamSelect(Team team){

        return isEmpty(team.getTn())&&isEmpty(team.getTi())&&
                isEmpty(team.getType())&&isEmpty(team.getPersonId());
    }


    public static boolean graduateSelect(Graduate graduate){
        return isEmpty(graduate.getO())&&isEmpty(graduate.getI());
    }

    public static boolean awardSele(Award award){

        return isEmpty(award.getD())&&isEmpty(award.getN());
    }


    public static boolean tranSele(TranPlan tranPlan){

        return isEmpty(tranPlan.getPlan());
    }


}
