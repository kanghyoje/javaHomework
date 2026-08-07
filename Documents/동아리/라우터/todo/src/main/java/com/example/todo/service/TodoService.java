package com.example.todo.service;

import com.example.todo.dto.request.TodoCreateRequest;
import com.example.todo.dto.request.TodoUpdateRequest;
import com.example.todo.dto.response.TodoResponse;

import java.util.List;

public interface TodoService {
    TodoResponse createTodo(TodoCreateRequest request);

    List<TodoResponse> getTodos();

    TodoResponse getTodo(Long id);

    TodoResponse updateTodo(Long id, TodoUpdateRequest request);

    void deleteTodo(Long id);
}
