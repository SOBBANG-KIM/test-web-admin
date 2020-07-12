package com.example.ksy.testwebadmin.controller;

import com.example.ksy.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    CommonService commonService;

    @RequestMapping("/")
    public String index() {
        System.out.println(commonService.test());
        return "index";
    }
}
