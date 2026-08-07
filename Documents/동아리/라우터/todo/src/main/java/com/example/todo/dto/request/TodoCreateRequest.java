package com.example.todo.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class TodoCreateRequest {

    @NotBlank
    private String title;

    private String content;
}
