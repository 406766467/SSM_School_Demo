package com.sky.ssmdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/zhujie")
public class ZhuJieController {

    @RequestMapping("test")
    /*
    *@RequestParam(value,defaultValue,required)
    * 传参来的名称，默认值，是否必须
    * */
    public String test(ModelMap modelMap,String name,Integer age){
        List books = new ArrayList();
        books.add(name+1);
        books.add(name+2);
        books.add(name+3);
        modelMap.put("books",books);
        modelMap.put("name",name);
        modelMap.put("age",age);
        System.out.println("zhujie");
        return "books";
    }
}
