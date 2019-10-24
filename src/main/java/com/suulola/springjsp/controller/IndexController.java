package com.suulola.springjsp.controller;

import com.suulola.springjsp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class IndexController extends LoginService {

    @Autowired
    LoginService loginService;

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("name", "Wave");
        return "index";
    }

    @RequestMapping("/contact")
    public String contactPage(Model model) {
        model.addAttribute("phone", "07061972413");
        return "contact";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap modelMap) {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String logIn(ModelMap modelMap,
                        @RequestParam String username,
                        @RequestParam String password) {
        boolean isValidUser =  loginService.validateUser(username, password);
        if(!isValidUser) {
            modelMap.put("errorMessage", "Invalid credential");
            return "login";
        }
        modelMap.put("username", username);
        modelMap.put("password", password);
        return "welcome";
    }
}
