/*
 * Copyright (c) 2020
 * Date:2020/06/16 13:47:16
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {

    String i;//学生学号

    String n;//学生姓名
    String gender;//学生性别
    String a;//学生所在学院

    String l;//学生年龄

    String t;//学生导师工号

    //该字段不应储存在数据库中
    String status;//审核状态

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
