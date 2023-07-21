package com.example.springboot3todoapplication.repositories;

import com.example.springboot3todoapplication.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItem,Long> {
}
