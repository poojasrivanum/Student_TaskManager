package com.pooja.taskManager.service;

import com.pooja.taskManager.model.Task;
import com.pooja.taskManager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // Create Single Task
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    // Create Multiple Tasks
    public List<Task> createMultipleTasks(List<Task> tasks) {
        return taskRepository.saveAll(tasks);
    }

    // Get All Tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Update Task
    public Task updateTask(Long id, Task updatedTask) {

        Optional<Task> optionalTask = taskRepository.findById(id);

        if (optionalTask.isPresent()) {

            Task existingTask = optionalTask.get();

            existingTask.setTitle(updatedTask.getTitle());
            existingTask.setDescription(updatedTask.getDescription());
            existingTask.setStatus(updatedTask.getStatus());

            return taskRepository.save(existingTask);
        }

        return null;
    }

    // Delete Task
    public boolean deleteTask(Long id) {

        Optional<Task> optionalTask = taskRepository.findById(id);

        if (optionalTask.isPresent()) {
            taskRepository.deleteById(id);
            return true;
        }

        return false;
    }
}