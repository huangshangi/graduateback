package com.sdu.graduateback.controller;

import com.sdu.graduateback.dto.Ceshi;
import com.sdu.graduateback.dto.Result;
import com.sdu.graduateback.dto.User;
import com.sdu.graduateback.mapper.UserMapper;
import com.sdu.graduateback.utils.EncryptUtil;
import com.sdu.graduateback.utils.HttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ceshiController {




    @RequestMapping(value = "/c",method = RequestMethod.POST)
    @ResponseBody
    public String ceshi(@RequestBody String s){

        String openid= EncryptUtil.generateToken(s);


        return openid;
    }

}
