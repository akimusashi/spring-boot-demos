package com.moon.angulartest01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/index")
public class IndexController {

    @RequestMapping("/page")
    public String index() {
        return "index";
    }
}
