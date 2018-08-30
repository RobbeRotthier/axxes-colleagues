package com.axxes.colleagues.api;

import com.axxes.colleagues.domain.User;
import com.axxes.colleagues.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/users")
    public Iterable<User> getAll() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public Optional<User> get(@PathVariable("id") long id) {
        return userService.findById(id);
    }
}
