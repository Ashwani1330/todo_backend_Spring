package com.example.todo.controller;

import com.example.todo.dto.addTaskDTO;
import com.example.todo.model.todoEntity;
import com.example.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class taskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/add")
    public ResponseEntity<todoEntity> addTask(@RequestBody addTaskDTO taskDTO) {
        var task = taskService.addTask(taskDTO.getTitle(), taskDTO.getDescription());

        return ResponseEntity.ok(task);
    }
}
