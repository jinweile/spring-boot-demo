package com.example.myproject.web;

import com.example.myproject.db.service.intf.ICalllimittimesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinweile on 2015/6/26.
 */
@Controller
public class Index {

    @Autowired
    //@Qualifier("ICalllimittimesService")
    private ICalllimittimesService service;

    @Autowired
    private Environment env;

    @RequestMapping("/")
    //@ResponseBody
    public ModelAndView home() throws SQLException {
        System.out.println("=========" + env.getProperty("abc") + "=========");
        int count = service.GetCount(null);
        System.out.println("==============count:" + count + "=============");
        Map map = new HashMap();
        map.put("hello", "hello world!我的第一个spring-boot程序");
        map.put("now",new Date());
        ModelAndView model = new ModelAndView();
        model.addAllObjects(map);
        model.setViewName("test");
        return model;
    }

    @RequestMapping(value="/upload", method= RequestMethod.POST)
    public @ResponseBody String handleFileUpload(@RequestParam("name") String name,
                                                  @RequestParam("file") MultipartFile file){
        if (!file.isEmpty()) {
            try {
                file.getName();
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File("D:\\temp\\" + name + "-uploaded")));
                stream.write(bytes);
                stream.close();
                return "You successfully uploaded " + name + " into " + name + "-uploaded !";
            } catch (Exception e) {
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + name + " because the file was empty.";
        }
    }

}
