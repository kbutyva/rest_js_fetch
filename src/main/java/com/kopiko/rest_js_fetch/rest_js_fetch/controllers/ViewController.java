package com.kopiko.rest_js_fetch.rest_js_fetch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class ViewController {

    @GetMapping()
    public String pageForUser() {
        return "myPage";
    }
}