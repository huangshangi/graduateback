/*
 * Copyright (c) 2020
 * Date:2020/06/16 15:09:16
 * Author:huangshangi
 * explain:该类应在数据库中储存
 *
 */

package com.sdu.graduateback.dto;

//信息待完善
public class TranPlan {

    String i;//学生学号

    String name;//姓名 无意义字符
    String plan;
    String status;//审核状态


    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
