package com.suulola.springjsp.service;

import com.suulola.springjsp.model.Todo;
import com.suulola.springjsp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    TodoRepository todoRepository;


    @Override
    public List<Todo> getTodosByUser(String user) {
        return todoRepository.findByUser(user);
    }

    @Override
    public Optional<Todo> getTodoById(long id) {
        return todoRepository.findById(id);
    }

    @Override
    public void updateTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void addTodo(String user, String description, Date date, boolean isDone) {
        todoRepository.save(new Todo(user, description, date, isDone));
    }

    @Override
    public void deleteTodo(long id) {
        Optional<Todo> todo = todoRepository.findById(id);

        if(todo.isPresent()) {
            todoRepository.delete(todo.get());
        }
    }

    @Override
    public void saveTodo(Todo todo) {
        todoRepository.save(todo);
    }
}
