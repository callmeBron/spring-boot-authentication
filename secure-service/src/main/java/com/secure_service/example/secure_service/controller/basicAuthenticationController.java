package com.secure_service.example.secure_service.controller;


import com.secure_service.example.secure_service.model.UserObjectModel;
import com.secure_service.example.secure_service.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// to be moved to independent model class
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class basicAuthenticationController {
    private final UserService userService;

    public basicAuthenticationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserObjectModel>> greetUser() {
        return ResponseEntity.ok(userService.getUsers());
    }
}
