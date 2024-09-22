package com.example.todo.service;

import com.example.todo.model.todoEntity;
import com.example.todo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    private ArrayList<todoEntity> taskArray = new ArrayList<todoEntity>();

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public todoEntity addTask(String title, String description) {
        todoEntity task = new todoEntity();
        task.setTitle(title);
        task.setDescription(description);
        task.setCreatedAt(LocalDateTime.now());
        taskRepository.save(task);
        taskArray.add(task);
        return task;
    }

}
