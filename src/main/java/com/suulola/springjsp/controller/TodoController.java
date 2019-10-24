package com.suulola.springjsp.controller;

import com.suulola.springjsp.repository.TodoRepository;
import com.suulola.springjsp.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@SessionAttributes("username")
public class TodoController {

    @Autowired
    TodoServiceImpl todoService;

    @Autowired
    TodoRepository todoRepository;



    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String getAllTodos(ModelMap modelMap) {
        modelMap.put("todos", todoRepository.findAll());
        return "list-todos";
    }

    @RequestMapping(value = "/list-todos", method = RequestMethod.POST)
    public String addTodo(
            ModelMap modelMap,
            @RequestParam String description,
            @RequestParam String deadline
            ) {
        Date formattedDate = null;
        try {
            formattedDate = new SimpleDateFormat("dd-MM-yyyy").parse(deadline);
            System.out.println("formatted date is " + formattedDate);
        } catch (ParseException e) {
            System.out.println(e);
            formattedDate = new Date();
        }

        todoService.addTodo("username", description, formattedDate, false);

        System.out.println(todoService.toString());
        modelMap.put("todos", todoRepository.findAll());
        return "list-todos";
    }
}
