package com.pooja.taskManager.controller;

import com.pooja.taskManager.model.Task;
import com.pooja.taskManager.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // Create Single Task
    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {

        Task createdTask = taskService.createTask(task);

        return new ResponseEntity<>(createdTask, HttpStatus.CREATED);
    }

    // Create Multiple Tasks
    @PostMapping("/bulk")
    public ResponseEntity<List<Task>> createMultipleTasks(
            @RequestBody List<Task> tasks) {

        List<Task> createdTasks = taskService.createMultipleTasks(tasks);

        return new ResponseEntity<>(createdTasks, HttpStatus.CREATED);
    }

    // Get All Tasks
    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {

        List<Task> tasks = taskService.getAllTasks();

        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    // Update Task
    @PutMapping("/{id}")
    public ResponseEntity<?> updateTask(
            @PathVariable Long id,
            @RequestBody Task task) {

        Task updatedTask = taskService.updateTask(id, task);

        if (updatedTask != null) {
            return new ResponseEntity<>(updatedTask, HttpStatus.OK);
        }

        return new ResponseEntity<>("Task not found", HttpStatus.NOT_FOUND);
    }

    // Delete Task
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable Long id) {

        boolean deleted = taskService.deleteTask(id);

        if (deleted) {
            return new ResponseEntity<>("Task deleted successfully", HttpStatus.OK);
        }

        return new ResponseEntity<>("Task not found", HttpStatus.NOT_FOUND);
    }
}