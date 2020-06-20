/*
 * Copyright (c) 2020
 * Date:2020/06/12 08:46:12
 * Author:huangshangi
 * explain:教师个人信息实体
 *
 */

package com.sdu.graduateback.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Teacher {

    private String id;//工号

    private String name;//姓名

    private String award;//获奖信息

    private String gender;//性别

    private String age;//年龄

    private String rank;//职称

    private String dirction;//研究方向

    private String eduback;//教育背景

    private String unit;//所在单位

    private String token;//该字段不应再数据库中出现

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getDirction() {
        return dirction;
    }

    public void setDirction(String dirction) {
        this.dirction = dirction;
    }

    public String getEduback() {
        return eduback;
    }

    public void setEduback(String eduback) {
        this.eduback = eduback;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    public String toString(){
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
