package com.example.todoo.controller;

import java.util.List;

import com.example.todoo.model.Todo;
import com.example.todoo.repository.TodoRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    private final TodoRepository repository;

    TodoController(TodoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/todos")
    List<Todo> getAll() {
        return (List<Todo>) repository.findAll();
    }
}
