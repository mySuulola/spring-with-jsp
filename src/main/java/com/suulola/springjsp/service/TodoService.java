package com.suulola.springjsp.service;

import com.suulola.springjsp.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;

    static {
        todos.add(new Todo("Niyi", "Learn Spring", new Date(), false));
        todos.add(new Todo("Graham", "Learn React Native", new Date(), false));
        todos.add(new Todo("Johnson", "Sleep", new Date(), false));
    }

    public List<Todo> retreiveAllTodos() {
        return todos;
    }



}
