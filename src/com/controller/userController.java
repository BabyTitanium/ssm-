package com.controller;

import com.model.User;
import com.service.userService;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 天逸 on 2018/7/6.
 */
@Controller
public class userController {
    @Autowired
    private userService userservice;
    protected final Logger log = Logger.getLogger(this.getClass());
    @RequestMapping(value = "/hello.do")
    public String findOneUser(ModelMap modelMap,Integer id){
        log.info("查询id为1的");
       // Integer id=1;
        User user=userservice.findOneUser(id);
        String name=user.getUsername();
        modelMap.addAttribute("name",name);
        return "hello";
    }
}
