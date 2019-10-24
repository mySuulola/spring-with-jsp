package com.suulola.springjsp.service;

import com.suulola.springjsp.model.Todo;
import com.suulola.springjsp.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public interface TodoService {

    List < Todo > getTodosByUser(String user);

    Optional <Todo> getTodoById(long id);

    void updateTodo(Todo todo);

    void addTodo(String user, String description, Date date, boolean isDone);

    void deleteTodo(long id);

    void saveTodo(Todo todo);

}
