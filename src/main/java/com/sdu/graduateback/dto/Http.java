/*
 * Copyright (c) 2020
 * Date:2020/06/17 08:36:17
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.dto;

import java.util.List;

public class Http {

    String openid;

    String session_key;

    String errcode;

    String errormsg;

    List<String> hints;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }


    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    public List<String> getHints() {
        return hints;
    }

    public void setHints(List<String> hints) {
        this.hints = hints;
    }

    @Override
    public String toString() {
        return "Http{" +
                "openid='" + openid + '\'' +
                ", session_key='" + session_key + '\'' +
                ", errcode='" + errcode + '\'' +
                ", errormsg='" + errormsg + '\'' +
                ", hints=" + hints +
                '}';
    }
}
