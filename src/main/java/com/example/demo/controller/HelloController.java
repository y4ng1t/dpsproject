package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/it")
    public String it(Model model) {
        return "IT";
    }

    @GetMapping("/is")
    public String is(Model model) {
        return "IS";
    }

    @GetMapping("/dkvs")
    public String dkv(Model model) {
        return "dkv";
    }

    @GetMapping("/id")
    public String id(Model model) {
        return "ID";
    }

    @GetMapping("/aboutuss")
    public String aboutUs(Model model) {
        return "aboutus";
    }

    @GetMapping("/contacts")
    public String contact(Model model) {
        return "contact";
    }
}
