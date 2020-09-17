package com.madskchristensen.ajaxweatherapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/ajax")
    public String ajaxDemo() {
        return "ajax";
    }
}
