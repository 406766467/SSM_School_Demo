package com.sky.ssmdemo.controller;

import com.sky.ssmdemo.mapper.TeacherMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;


public class TestController implements Controller {

    //编写一个测试用例
    private SqlSession session = null;


    private InputStream ins;


    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        ins = Resources.getResourceAsStream("com/sky/ssmdemo/config/Mybatis-Config.xml");
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(ins);
//        session = factory.openSession(true);
//        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        System.out.println("TestController测试类");
        ModelAndView view = new ModelAndView("books");
//        view.addObject("list", mapper.selectAll());
        return view;
    }
}
