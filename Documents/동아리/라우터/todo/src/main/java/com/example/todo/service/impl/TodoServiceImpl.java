package com.example.todo.service.impl;

import com.example.todo.dto.request.TodoCreateRequest;
import com.example.todo.dto.request.TodoUpdateRequest;
import com.example.todo.dto.response.TodoResponse;
import com.example.todo.entity.Todo;
import com.example.todo.repository.TodoRepository;
import com.example.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;

    @Override
    @Transactional
    public TodoResponse createTodo(TodoCreateRequest request) {
        Todo todo = Todo.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .isCompleted(false)
                .build();

        todoRepository.save(todo);
        return TodoResponse.from(todo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TodoResponse> getTodos() {
        return todoRepository.findAll().stream()
                .map(TodoResponse::from)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public TodoResponse getTodo(Long id) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 할 일는 없습니다."));

        return TodoResponse.from(todo);
    }

    @Override
    @Transactional
    public TodoResponse updateTodo(Long id, TodoUpdateRequest request) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 존재하지 않습니다."));

        todo.setTitle(request.getTitle());
        todo.setContent(request.getContent());
        todo.setIsCompleted(request.isCompleted());

        return TodoResponse.from(todo);
    }

    @Override
    @Transactional
    public void deleteTodo(Long id) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 존재하지 않습니다"));

        todoRepository.deleteById(id);
    }
}