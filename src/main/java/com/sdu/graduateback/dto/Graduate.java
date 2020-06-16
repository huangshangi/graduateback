/*
 * Copyright (c) 2020
 * Date:2020/06/16 13:03:16
 * Author:huangshangi
 * explain:毕业申请实体类 应在数据库中储存
 *
 */

package com.sdu.graduateback.dto;

public class Graduate {

    String i;//论文拥有者id

    String ga;//毕业申请审核

    String e;//外审论文审核

    String gp;//毕业论文审核

    //以下字段不应储存在数据库中
    String token;
    String t;
    String o;



    public String getGa() {
        return ga;
    }

    public void setGa(String ga) {
        this.ga = ga;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getGp() {
        return gp;
    }

    public void setGp(String gp) {
        this.gp = gp;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }
}
