/*
 * Copyright (c) 2020
 * Date:2020/06/16 13:00:16
 * Author:huangshangi
 * explain:论文实体类  应在数据库中储存
 *
 */

package com.sdu.graduateback.dto;

public class Thesis {



    String i;//论文所有者id

    String t;//论文申请时间

    String pt;//论文题目

    String pc;//论文内容

    String a;//导师id

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
}
