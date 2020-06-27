package com.sdu.graduateback.mapper;

import com.sdu.graduateback.dto.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test {
    @Autowired
    //private UserMapper userMapper;
    //private TeacherMapper teacherMapper;
    //private TeamMapper teamMapper;
    //private TranPlanMapper tranPlanMapper;
    //private ThesisMapper thesisMapper;
    private GoAbroadMapper goAbroadMapper;
    //private AwardMapper awardMapper;
    //private GraduateMapper graduateMapper;
    //private StudentMapper studentMapper;
    //private RecuritMapper recuritMapper;
    //private RecuritQualificationMapper recuritQualificationMapper;
    //private StudentMapper studentMapper;
    //private TeamMapper teamMapper;
//    @Test
//    public void addUser() {
//        User user = new User();
//        user.setU("韩志辉");
//        user.setP("12345");
//        user.setUser_id("3");
//        user.setUser_type("teacher");
//        userMapper.addUser(user);
//    }
//    @Test
//    public void bytk(){
//        User a = userMapper.getUserByToken("3");
//        System.out.println(a.getU());
//    }
//    @Test
//    public void byop(){
//        User a = userMapper.getUserByOpenid("3");
//        System.out.println(a.getU());
//    }
//    @Test
//    public void byid(){
//        User a = userMapper.getUserByOpenid("3");
//        System.out.println(a.getU());
//    }
//    @Test
//    public void vopid(){
//        int a = userMapper.verifyOpenid("1");
//        System.out.println(a);
//    }
//    @Test
//    public void uppid(){
//        userMapper.updateOpenid("666","3");
//    }
//    @Test
//    public void upptk(){
//        userMapper.updateToken("666","3");
//    }
//    @Test
//    public void uppidtk(){
//        userMapper.updateOpenIdByToken("888","666");
//    }
//    @Test
//    public void upuser(){
//        User user = new User();
//        user.setU("韩志辉");
//        user.setP("12345");
//        user.setUser_id("3");
//        user.setUser_type("teacher");
//        userMapper.updateUser(user);
//    }
//    @Test
//    public void idte(){
//        Teacher teacher = teacherMapper.getTeacherById("2");
//        System.out.println(teacher.getName());
//        teacher.setAge("ddddsb");
//        teacherMapper.updateTeacher(teacher);
//    }
    @Test
    public void test(){
        GoAbroad goAbroad = goAbroadMapper.getGoAbroadById("201701");
        GoAbroad goAbroad1 = new GoAbroad();
        goAbroad1.setTime("8888");
        goAbroad1.setId("201708");
        goAbroadMapper.insertGoAbroad(goAbroad1);
    }

}
