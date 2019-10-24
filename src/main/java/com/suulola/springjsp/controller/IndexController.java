package com.suulola.springjsp.controller;

import com.suulola.springjsp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showLoginPage(ModelMap modelMap) {
        modelMap.addAttribute("name", "Wave");
        return "login";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
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
