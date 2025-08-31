    package com.example.config;

    import com.example.service.UserService;
    import com.example.service.UserServiceImpl;
    import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

    @Configuration
    @ComponentScan(basePackages = "com.example.service")
    public class AppConfig {

        @Bean
        public UserService userService() {
            return new UserServiceImpl();
        }

        // ... other configurations
    }