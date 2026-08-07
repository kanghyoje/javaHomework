package com.example.todo.dto.response;

import com.example.todo.entity.Todo;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TodoResponse {
    private Long id;
    private String title;
    private String content;
    private Boolean isCompleted;

    public static TodoResponse from(Todo todo) {
        return TodoResponse.builder()
                .id(todo.getId())
                .title(todo.getTitle())
                .content(todo.getContent())
                .isCompleted(todo.getIsCompleted())
                .build();
    }
}
