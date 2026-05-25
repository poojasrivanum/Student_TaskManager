package com.pooja.taskManager.repository;

import com.pooja.taskManager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}