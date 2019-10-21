package com.suulola.springjsp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("name", "Suulola Oluwaseyi");
        return "index";
    }
}
