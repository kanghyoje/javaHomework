package com.example.todo_list.controller;

import java.util.List;

import com.example.todo_list.dto.TodoCreateRequest;
import com.example.todo_list.dto.TodoResponse;
import com.example.todo_list.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class TodoController {

	private final TodoService todoService;
	public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}

	@GetMapping
	public List<TodoResponse> getTodos() {
		return todoService.getTodos();
	}
	@PostMapping
	public ResponseEntity<TodoResponse> createTodo(@RequestBody TodoCreateRequest request) {
		try {
			TodoResponse savedTodo = todoService.createTodo(request);
			return ResponseEntity.status(HttpStatus.CREATED).body(savedTodo);
		} catch (IllegalArgumentException exception) {
			return ResponseEntity.badRequest().build();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
		if (!todoService.deleteTodo(id)) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.noContent().build();
	}
}
