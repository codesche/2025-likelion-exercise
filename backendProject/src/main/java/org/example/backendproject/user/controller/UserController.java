package org.example.backendproject.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Value("${PROJECT_NAME:web Server}")
    private String instanceName;

    @GetMapping
    public String test() {
        return instanceName;
    }

}
