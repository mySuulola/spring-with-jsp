package com.suulola.springjsp.repository;

import com.suulola.springjsp.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository< Todo, Long > {
    List<Todo> findByUser(String user);
}
