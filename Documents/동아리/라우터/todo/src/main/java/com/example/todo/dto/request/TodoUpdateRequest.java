package com.example.todo.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class TodoUpdateRequest {
    @NotBlank
    private String title;

    private String content;

    @NotNull
    private boolean isCompleted;
}
