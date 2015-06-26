package com.example.myproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinweile on 2015/6/26.
 */
@Controller
public class Index {

    @RequestMapping("/")
    //@ResponseBody
    public ModelAndView home() {
        Map map = new HashMap();
        map.put("hello", "hello world!我的第一个spring-boot程序");
        map.put("now",new Date());
        ModelAndView model = new ModelAndView();
        model.addAllObjects(map);
        model.setViewName("test");
        return model;
    }

}
