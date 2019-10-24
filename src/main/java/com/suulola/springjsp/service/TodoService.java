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
        todos.add(new Todo(1,"Niyi", "Read", new Date(), false));
        todos.add(new Todo(2, "Graham", "Eat", new Date(), false));
        todos.add(new Todo(3, "Johnson", "Sleep", new Date(), false));
    }

    public List<Todo> retreiveAllTodos() {
        return todos;
    }

    public List<Todo> addTodo(String user, String description, Date date) {
        int currentSize = todos.size();
        todos.add(new Todo(5, user, description, date, false ));
        return todos;
    }



}
