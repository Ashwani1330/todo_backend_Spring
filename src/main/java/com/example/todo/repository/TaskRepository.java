package com.example.todo.repository;

import com.example.todo.model.todoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<todoEntity, Long> {
    // Custom query methods can be added here if needed
}
