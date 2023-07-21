package com.example.springboot3todoapplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "todo_items")
public class TodoItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String description;
    private Boolean isComplete;
    private Instant createAt;
    private Instant updatedAt;
    @Override
    public String toString(){
        return String.format("TodoItem{id=%d, description='%s', isComplete='%s', ceartedAt='%s', updatedAt='%s'}",
                id,description,isComplete,createAt,updatedAt);
    }

}
