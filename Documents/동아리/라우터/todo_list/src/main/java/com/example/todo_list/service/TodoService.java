package com.example.todo_list.service;

import java.util.List;

import com.example.todo_list.domain.Todo;
import com.example.todo_list.dto.TodoCreateRequest;
import com.example.todo_list.dto.TodoResponse;
import com.example.todo_list.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private final TodoRepository todoRepository;

	public TodoService(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	public List<TodoResponse> getTodos() {
		return todoRepository.findAll(Sort.by(Sort.Direction.ASC, "id"))
				.stream()
				.map(TodoResponse::from)
				.toList();
	}

	
	public TodoResponse createTodo(TodoCreateRequest request) {
		if (request == null || request.title() == null || request.title().trim().isEmpty()) {
			throw new IllegalArgumentException("title is required");
		}

		Todo todo = new Todo(request.title().trim());
		Todo savedTodo = todoRepository.save(todo);
		return TodoResponse.from(savedTodo);
	}

	public boolean deleteTodo(Long id) {
		if (!todoRepository.existsById(id)) {
			return false;
		}
		todoRepository.deleteById(id);
		return true;
	}
}
