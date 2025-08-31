package com.example.controller;

import com.example.model.Task;
import com.example.model.TaskStatus;
import com.example.model.User;
import com.example.repository.TaskRepository;
import com.example.repository.UserRepository;
import com.example.service.SessionManager;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final SessionManager sessionManager;
    private final UserRepository userRepository;
    private final TaskRepository taskRepository;

    public AdminController(SessionManager sessionManager, UserRepository userRepository, TaskRepository taskRepository) {
        this.sessionManager = sessionManager;
        this.userRepository = userRepository;
        this.taskRepository = taskRepository;
    }

    // --- Dashboard ---
    @GetMapping("/admin-dashboard")
    public String adminDashboard(HttpSession session, Model model) {
        if (!sessionManager.isAdmin(session)) {
            return "redirect:/login";
        }

        List<Task> tasks = taskRepository.findAll();
        long pendingCount = tasks.stream().filter(t -> t.getStatus() == TaskStatus.PENDING).count();
        long inProgressCount = tasks.stream().filter(t -> t.getStatus() == TaskStatus.IN_PROGRESS).count();
        long completedCount = tasks.stream().filter(t -> t.getStatus() == TaskStatus.COMPLETED).count();
        long delayedCount = tasks.stream().filter(t -> t.getStatus() == TaskStatus.DELAYED).count();

        model.addAttribute("users", userRepository.findAll());
        model.addAttribute("tasks", tasks);
        model.addAttribute("pendingCount", pendingCount);
        model.addAttribute("inProgressCount", inProgressCount);
        model.addAttribute("completedCount", completedCount);
        model.addAttribute("delayedCount", delayedCount);

        return "admin-dashboard";
    }

    // --- User Management ---
    @GetMapping("/users")
    public String listUsers(HttpSession session, Model model) {
        if (!sessionManager.isAdmin(session)) {
            return "redirect:/login";
        }
        model.addAttribute("users", userRepository.findAll());
        return "admin/users";
    }

    @GetMapping("/users/new")
    public String newUserForm(HttpSession session, Model model) {
        if (!sessionManager.isAdmin(session)) {
            return "redirect:/login";
        }
        model.addAttribute("user", new User());
        return "admin/user-form";
    }

    @GetMapping("/users/edit/{id}")
    public String editUserForm(@PathVariable Integer id, HttpSession session, Model model) {
        if (!sessionManager.isAdmin(session)) {
            return "redirect:/login";
        }
        userRepository.findById(id).ifPresent(user -> model.addAttribute("user", user));
        return "admin/user-form";
    }

    @PostMapping("/users/save")
    public String saveUser(@ModelAttribute User user, HttpSession session, RedirectAttributes redirectAttributes) {
        if (!sessionManager.isAdmin(session)) {
            return "redirect:/login";
        }
        userRepository.save(user);
        redirectAttributes.addFlashAttribute("message", "User saved successfully!");
        return "redirect:/admin/users";
    }

    @GetMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable Integer id, HttpSession session, RedirectAttributes redirectAttributes) {
        if (!sessionManager.isAdmin(session)) {
            return "redirect:/login";
        }
        userRepository.deleteById(id);
        redirectAttributes.addFlashAttribute("message", "User deleted successfully!");
        return "redirect:/admin/users";
    }

    // --- Task Management ---
    @GetMapping("/tasks")
    public String listTasks(HttpSession session, Model model) {
        if (!sessionManager.isAdmin(session)) {
            return "redirect:/login";
        }
        model.addAttribute("tasks", taskRepository.findAll());
        return "admin/tasks";
    }

    @GetMapping("/tasks/new")
    public String newTaskForm(HttpSession session, Model model) {
        if (!sessionManager.isAdmin(session)) {
            return "redirect:/login";
        }
        model.addAttribute("task", new Task());
        model.addAttribute("users", userRepository.findAll());
        return "admin/task-form";
    }

    @GetMapping("/tasks/edit/{id}")
    public String editTaskForm(@PathVariable Long id, HttpSession session, Model model) {
        if (!sessionManager.isAdmin(session)) {
            return "redirect:/login";
        }
        taskRepository.findById(id).ifPresent(task -> model.addAttribute("task", task));
        model.addAttribute("users", userRepository.findAll());
        return "admin/task-form";
    }

    @PostMapping("/tasks/save")
    public String saveTask(@ModelAttribute Task task, @RequestParam Integer assignedToId, HttpSession session, RedirectAttributes redirectAttributes) {
        if (!sessionManager.isAdmin(session)) {
            return "redirect:/login";
        }
        userRepository.findById(assignedToId).ifPresent(task::setAssignedTo);
        taskRepository.save(task);
        redirectAttributes.addFlashAttribute("message", "Task saved successfully!");
        return "redirect:/admin/tasks";
    }

    @GetMapping("/tasks/delete/{id}")
    public String deleteTask(@PathVariable Long id, HttpSession session, RedirectAttributes redirectAttributes) {
        if (!sessionManager.isAdmin(session)) {
            return "redirect:/login";
        }
        taskRepository.deleteById(id);
        redirectAttributes.addFlashAttribute("message", "Task deleted successfully!");
        return "redirect:/admin/tasks";
    }
}
