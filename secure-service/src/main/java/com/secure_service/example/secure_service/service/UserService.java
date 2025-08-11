package com.secure_service.example.secure_service.service;

import com.secure_service.example.secure_service.model.UserObjectModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<UserObjectModel> getUsers() {
        List<UserObjectModel> users = List.of(
                new UserObjectModel(
                        "Jack",
                        "jack.handle@gmail.com",
                        "Discovery bank"
                )
        );
        return users;
    }
}
