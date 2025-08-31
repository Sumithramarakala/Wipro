package com.example.controller;

import com.example.model.Comment;
import com.example.model.Task;
import com.example.model.TaskStatus;
import com.example.model.User;
import com.example.repository.CommentRepository;
import com.example.repository.TaskRepository;
import com.example.repository.UserRepository;
import com.example.service.SessionManager;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    private final SessionManager sessionManager;
    private final TaskRepository taskRepository;
    private final CommentRepository commentRepository;

    public UserController(SessionManager sessionManager, TaskRepository taskRepository, CommentRepository commentRepository) {
        this.sessionManager = sessionManager;
        this.taskRepository = taskRepository;
        this.commentRepository = commentRepository;
    }

    @GetMapping("/dashboard")
    public String userDashboard(HttpSession session, Model model) {
        User currentUser = sessionManager.getCurrentUser(session);
        if (currentUser == null) {
            return "redirect:/login"; // Redirect if not logged in
        }

        List<Task> assignedTasks = taskRepository.findByAssignedTo(currentUser);
        model.addAttribute("tasks", assignedTasks);
        model.addAttribute("currentUser", currentUser);
        return "user-dashboard";
    }

    @PostMapping("/tasks/{id}/update-status")
    public String updateTaskStatus(@PathVariable Long id, @RequestParam("status") String status, HttpSession session, RedirectAttributes redirectAttributes) {
        User currentUser = sessionManager.getCurrentUser(session);
        if (currentUser == null) {
            return "redirect:/login";
        }

        Optional<Task> optionalTask = taskRepository.findById(id);
        if (optionalTask.isPresent()) {
            Task task = optionalTask.get();
            if (task.getAssignedTo().equals(currentUser)) {
                task.setStatus(TaskStatus.valueOf(status));
                taskRepository.save(task);
                redirectAttributes.addFlashAttribute("message", "Task status updated successfully!");
            } else {
                redirectAttributes.addFlashAttribute("error", "You do not have permission to update this task.");
            }
        } else {
            redirectAttributes.addFlashAttribute("error", "Task not found.");
        }
        return "redirect:/user/dashboard";
    }

    @PostMapping("/tasks/{id}/add-comment")
    public String addCommentToTask(@PathVariable Long id, @RequestParam("commentText") String commentText, HttpSession session, RedirectAttributes redirectAttributes) {
        User currentUser = sessionManager.getCurrentUser(session);
        if (currentUser == null) {
            return "redirect:/login";
        }

        Optional<Task> optionalTask = taskRepository.findById(id);
        if (optionalTask.isPresent()) {
            Task task = optionalTask.get();
            Comment newComment = new Comment();
            newComment.setTask(task);
            newComment.setUser(currentUser);
            newComment.setText(commentText);
            newComment.setTimestamp(LocalDateTime.now());
            commentRepository.save(newComment);
            redirectAttributes.addFlashAttribute("message", "Comment added successfully!");
        } else {
            redirectAttributes.addFlashAttribute("error", "Task not found.");
        }
        return "redirect:/user/dashboard";
    }
}
