package com.example.todo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class addTaskDTO {
    String title;
    String description;
}