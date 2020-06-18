/*
 * Copyright (c) 2020
 * Date:2020/06/18 21:21:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.dto;
//成果表

public class Award {



    private String i;//成果id

    private String personId;//拥有者id

    private String t;//成果类型

    private String d;//成果详细信息

    private String n;//成果名称

    private String time;//成果发表日期

    private String token;

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
