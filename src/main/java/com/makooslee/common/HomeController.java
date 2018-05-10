package com.makooslee.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "login";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
