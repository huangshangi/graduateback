/*
 * Copyright (c) 2020
 * Date:2020/06/18 21:24:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.controller;

import com.sdu.graduateback.dto.Award;
import com.sdu.graduateback.dto.Result;
import com.sdu.graduateback.service.AwardService;
import com.sdu.graduateback.service.UserService;
import com.sdu.graduateback.utils.ErrorUtil;
import com.sdu.graduateback.utils.StringUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

public class AwardController {

    AwardService awardService;

    UserService userService;

    @RequestMapping(value = "/achi",method = RequestMethod.POST)
    @ResponseBody
    public Result achi(@RequestBody Award award){

        String token=award.getToken();

        if(StringUtil.isEmpty(token))
            return ErrorUtil.getErrorReport("参数错误");

        String personId=userService.getIdByToken(token);
        HashMap<String,Object>hashMap=new HashMap<>();

        if(StringUtil.awardSele(award)){
            //查询
            if(StringUtil.isEmpty(award.getI())){
                Award obj=awardService.getAwardById(award.getI());
                hashMap.put("result",obj);
            }else{
                List<Award>list=awardService.getAwards(personId);
                hashMap.put("result",list);
            }

            return new Result("success",null,hashMap);


        }else{

            Award newA=awardService.getAwardById(award.getI());
            newA=awardService.packAward(award,newA);

            if(awardService.updateAward(newA)==1)
                return new Result("success",null,null);
            else
                return ErrorUtil.getErrorReport("参数错误");




        }

    }
}
