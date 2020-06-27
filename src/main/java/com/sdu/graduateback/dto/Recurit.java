/*
 * Copyright (c) 2020
 * Date:2020/06/12 11:28:12
 * Author:huangshangi
 * explain:教师招生申请bean
 *
 */

package com.sdu.graduateback.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Recurit {


    private String id;//该专业唯一标志符

    private String code;//专业代码  eg:020101

    private String name;//专业名称  eg:020102

    private String type;//申请类型 eg:学术硕导

    private String academy;//该专业所属学院 eg:马克思主义学院(保留字段 数据库可不设置)


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }
}
