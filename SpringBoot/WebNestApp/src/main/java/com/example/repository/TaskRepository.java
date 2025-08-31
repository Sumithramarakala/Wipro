package com.example.repository;

import com.example.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.model.User;
import java.util.List;


@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	// In TaskRepository.java
	
	    List<Task> findByAssignedTo(User user);
	}

    // JpaRepository provides standard CRUD methods, such as:
    // .save(Task task)
    // .findById(Long id)
    // .findAll()
    // .deleteById(Long id)
    
    // You can add custom query methods here if needed.
    // For example, to find tasks by a specific user:
    // List<Task> findByAssignedTo(User user);
    
    // Or to find tasks by their status:
    // List<Task> findByStatus(TaskStatus status);

