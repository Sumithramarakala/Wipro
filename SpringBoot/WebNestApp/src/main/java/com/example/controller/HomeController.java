

package com.example.controller;

import com.example.model.User;
import com.example.service.SessionManager;
import com.example.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private SessionManager sessionManager;
    
    @GetMapping("/user-dashboard")
    public String showUserDashboardPage() {
        return "user-dashboard";
    }

    @GetMapping("/login")
    public String showLoginPage(HttpSession session) {
        if (sessionManager.isAuthenticated(session)) {
            // If already logged in, redirect to the appropriate dashboard
            User currentUser = sessionManager.getCurrentUser(session);
            if ("admin".equals(currentUser.getRole())) {
                return "redirect:/admin/admin-dashboard";
            }
            return "redirect:/user/user-dashboard";
        }
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam String username,
                          @RequestParam String password,
                          Model model,
                          HttpSession session) {
        if (sessionManager.login(session, username, password)) {
            User user = sessionManager.getCurrentUser(session);
            if ("admin".equals(user.getRole())) {
                return "redirect:/admin/admin-dashboard";
            }
            return "redirect:/user/user-dashboard";
        } else {
            model.addAttribute("error", "Invalid username/email or password!");
            return "login";
        }
    }

    @GetMapping("/registration")
    public String showRegistrationPage(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String doRegister(@ModelAttribute("user") User user, RedirectAttributes redirectAttributes) {
        if (userService.getByEmail(user.getEmail()) != null) {
            redirectAttributes.addFlashAttribute("error", "Email already registered!");
            return "redirect:/registration";
        }

        if (userService.getByName(user.getUsername()) != null) {
            redirectAttributes.addFlashAttribute("error", "Username already taken!");
            return "redirect:/registration";
        }

        userService.register(user);
        redirectAttributes.addFlashAttribute("message", "User registered successfully! Please log in.");
        return "redirect:/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        sessionManager.logout(session);
        return "redirect:/login";
    }
}
