//package com.example.service;
//
//import com.example.model.User;
//import com.example.repository.UserRepository;
//import jakarta.servlet.http.HttpSession;
//import org.springframework.stereotype.Service;
//import java.util.Optional;
//
//@Service
//public class SessionManager {
//    public static final String SESSION_USER_KEY = "SESSION_USER";
//    private final UserRepository userRepository;
//
//    public SessionManager(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public boolean login(HttpSession session, String username, String password) {
//        Optional<User> userOptional = userRepository.findByUsername(username);
//        if (userOptional.isPresent()) {
//            User user = userOptional.get();
//            // In a real application, you would verify a hashed password.
//            // For this example, we assume plain text for simplicity.
//            if (user.getPassword().equals(password)) {
//                session.setAttribute(SESSION_USER_KEY, user);
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public void logout(HttpSession session) {
//        session.invalidate();
//    }
//}

package com.example.service;

import com.example.model.User;
import com.example.repository.UserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SessionManager {
    public static final String SESSION_USER_KEY = "SESSION_USER";

    private final UserRepository userRepository;

    public SessionManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Authenticates a user and stores the User object in the session on success.
     * In a real application, you would use a password encoder (like BCrypt) here.
     *
     * @param session The current HttpSession.
     * @param username The username for authentication.
     * @param password The raw password for authentication.
     * @return true if authentication is successful, false otherwise.
     */
    public boolean login(HttpSession session, String username, String password) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            // IMPORTANT: Replace this with proper password hashing and comparison in a production app.
            if (user.getPassword().equals(password)) {
                session.setAttribute(SESSION_USER_KEY, user);
                return true;
            }
        }
        return false;
    }

    /**
     * Invalidates the session, effectively logging out the user.
     *
     * @param session The current HttpSession.
     */
    public void logout(HttpSession session) {
        session.invalidate();
    }

    /**
     * Retrieves the currently logged-in user from the session.
     *
     * @param session The current HttpSession.
     * @return The User object from the session, or null if no user is logged in.
     */
    public User getCurrentUser(HttpSession session) {
        return (User) session.getAttribute(SESSION_USER_KEY);
    }

    /**
     * Checks if a user is authenticated.
     *
     * @param session The current HttpSession.
     * @return true if a user object exists in the session, false otherwise.
     */
    public boolean isAuthenticated(HttpSession session) {
        return getCurrentUser(session) != null;
    }

    /**
     * Checks if the currently logged-in user has the "ADMIN" role.
     *
     * @param session The current HttpSession.
     * @return true if the user is an admin, false otherwise.
     */
    public boolean isAdmin(HttpSession session) {
        User user = getCurrentUser(session);
        return user != null && "ADMIN".equals(user.getRole());
    }
}

