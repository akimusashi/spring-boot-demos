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

    @RequestMapping("/http-test")
    public String httpTest() {
        return "angular-test/http-test";
    }

    @RequestMapping("/select-test")
    public String selectTest() {
        return "angular-test/select-test";
    }

    @RequestMapping("/table-test")
    public String tableTest() {
        return "angular-test/table-test";
    }

    @RequestMapping("/html-dom-test")
    public String HTMLDOMTest() {
        return "angular-test/html-dom-test";
    }

    @RequestMapping("/event-test")
    public String eventTest() {
        return "angular-test/event-test";
    }

    @RequestMapping("/validate-test")
    public String validateTest() {
        return "angular-test/validate-test";
    }

    @RequestMapping("/DI-test")
    public String DITest() {
        return "angular-test/DI-test";
    }

    @RequestMapping("/route-test")
    public String routeTest() {
        return "angular-test/route-test";
    }
}
