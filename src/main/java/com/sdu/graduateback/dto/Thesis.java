/*
 * Copyright (c) 2020
 * Date:2020/06/16 13:00:16
 * Author:huangshangi
 * explain:论文实体类  应在数据库中储存
 *
 */

package com.sdu.graduateback.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Thesis {



    String i;//论文所有者id

    String t;//论文申请时间

    String pt;//论文题目

    String pc;//论文内容

    String a;//导师id

    //以下字段不应再数据库中储存
    String type;//论文类型 外审论文 毕业论文
    String status;//论文审核状态

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }


    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
