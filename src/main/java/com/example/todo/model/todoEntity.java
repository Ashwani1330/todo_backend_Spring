package com.example.todo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "task")
@Data
public class todoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column
    private String description;

    @Column(nullable = false)
    private Boolean isCompleted = false;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column
    private LocalDateTime updatedAt;
}
