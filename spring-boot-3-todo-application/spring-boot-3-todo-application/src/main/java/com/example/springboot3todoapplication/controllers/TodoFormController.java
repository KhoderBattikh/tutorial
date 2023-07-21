package com.example.springboot3todoapplication.controllers;

import com.example.springboot3todoapplication.models.TodoItem;
import com.example.springboot3todoapplication.services.TodoItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class TodoFormController {
    @Autowired
    private TodoItemService todoItemService;

    @GetMapping("/create-todo")
    public String showCreateForm(TodoItem todoItem){
        System.out.println("\n\n\n\n\n\n\n KHoder: /create-todo");
        return "new-todo-item";
    }
    @PostMapping("/todo")
    public String createTodoItem(@Valid TodoItem todoItem,  Module module){
        System.out.println("\n\n\n\n\n\n\n KHoder: /todo");
        TodoItem item=new TodoItem();
        item.setDescription(todoItem.getDescription());
        item.setIsComplete(todoItem.getIsComplete());

        todoItemService.save(item);
        return "redirect:/";
    }
}
