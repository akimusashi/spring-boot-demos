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

    @RequestMapping("/test01")
    public String test01() {
        return "angular-test/test01";
    }

    @RequestMapping("/controller-test")
    public String controllerTest() {
        return "angular-test/controller-test";
    }

    @RequestMapping("/filter-test")
    public String filterTest() {
        return "angular-test/filter-test";
    }

    @RequestMapping("/service-test")
    public String serviceTest() {
        return "angular-test/service-test";
    }
}
