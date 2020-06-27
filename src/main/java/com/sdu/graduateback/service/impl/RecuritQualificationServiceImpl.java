/*
 * Copyright (c) 2020
 * Date:2020/06/18 14:28:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service.impl;

import com.sdu.graduateback.dto.Recurit;
import com.sdu.graduateback.dto.RecuritQualification;
import com.sdu.graduateback.mapper.RecuritMapper;
import com.sdu.graduateback.mapper.RecuritQualificationMapper;
import com.sdu.graduateback.service.RecuritQualificationService;
import com.sdu.graduateback.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class RecuritQualificationServiceImpl implements RecuritQualificationService {

    @Autowired
    RecuritQualificationMapper recuritQualificationMapper;

    @Autowired
    RecuritMapper recuritMapper;

    @Override
    public RecuritQualification getById(String id) {
        return recuritQualificationMapper.getById(id);
    }

    @Override
    public String getIdByToken(String id) {
        return null;
    }

    @Override
    public Object convertJson(RecuritQualification recuritQualification) {
        Map<String,Object> map=new HashMap<>();

        map.put("aaai",RecuritQualification.getJsonResult(recuritQualification));
        String loma=recuritQualification.getLoma();
        String nloma=recuritQualification.getNloma();
        String lomas[]=loma.split(",");
        String nlomas[]=nloma.split(",");

        List<Recurit> list=new ArrayList<>();
        List<Recurit>nlist=new ArrayList<>();

        for(String s:lomas)
            list.add(recuritMapper.getRecuritById(s));

        for(String s:nlomas)
            nlist.add(recuritMapper.getRecuritById(s));

        map.put("loma",list);
        map.put("nloma",nlist);


        return map;
    }

    @Override
    public RecuritQualification recuritQualificationPack(RecuritQualification oldR, RecuritQualification newR) {

        if(!StringUtils.isEmpty(oldR.getPc()))
            newR.setPc(oldR.getPc());

        if(!StringUtils.isEmpty(oldR.getBc()))
            newR.setBc(oldR.getBc());

        if(!StringUtils.isEmpty(oldR.getAc()))
            newR.setAc(oldR.getAc());

        if(!StringUtils.isEmpty(oldR.getIc()))
            newR.setIc(oldR.getIc());

        if(!StringUtils.isEmpty(oldR.getTc()))
            newR.setTc(oldR.getTc());

        if(!StringUtils.isEmpty(oldR.getDc()))
            newR.setDc(oldR.getDc());

        if(!StringUtils.isEmpty(oldR.getNc()))
            newR.setNc(oldR.getNc());

        if(!StringUtils.isEmpty(oldR.getNpc()))
            newR.setNpc(oldR.getNpc());

        if(!StringUtils.isEmpty(oldR.getPpc()))
            newR.setPpc(oldR.getPpc());

        if(!StringUtils.isEmpty(oldR.getNppc()))
            newR.setNppc(oldR.getNppc());

        if(!StringUtils.isEmpty(oldR.getCpc()))
            newR.setCpc(oldR.getCpc());

        if(!StringUtils.isEmpty(oldR.getDsc()))
            newR.setDsc(oldR.getDsc());

        if(!StringUtils.isEmpty(oldR.getMsc()))
            newR.setMsc(oldR.getMsc());

        if(!StringUtils.isEmpty(oldR.getHgdsc()))
            newR.setHgdsc(oldR.getHgdsc());

        return newR;
    }

    @Override
    public int updateRecuritQualification(RecuritQualification recuritQualification) {
        return recuritQualificationMapper.updateRecuritQualification(recuritQualification);
    }

    @Override
    public int deleApply(String tid) {
        return 0;
    }

    @Override
    public int addApply(String tid) {
        return 0;
    }

    @Override
    public RecuritQualification executeApply(RecuritQualification recuritQualification, String type, String tid) {

        String loma=recuritQualification.getLoma();
        String nloma=recuritQualification.getNloma();

        if(type.equals("1")){
            //删除申请招生信息
            recuritQualification.setLoma(deleteString(loma,tid));
            recuritQualification.setNloma(nloma+","+tid);
        }else{
            //申请招生信息
            recuritQualification.setLoma(loma+","+tid);

            recuritQualification.setNloma(deleteString(nloma,tid));

        }

        return recuritQualification;
    }


    String deleteString(String str,String dele){
        String array[]=str.split(",");
        StringBuilder res=new StringBuilder();
        for(String s:array)
            if(!s.equals(dele))
                res.append(s+",");


            return res.toString().substring(0,res.toString().length()-1);
    }
}
