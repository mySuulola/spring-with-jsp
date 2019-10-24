package com.suulola.springjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller("error")
public class ErrorController {

    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(HttpServletRequest httpServletRequest, Exception exception ) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("exception", exception.getLocalizedMessage());
        modelAndView.addObject("url", httpServletRequest.getRequestURL());

        modelAndView.setViewName("error");
        return modelAndView;
    }
}
