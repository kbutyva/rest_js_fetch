package com.kopiko.rest_js_fetch.rest_js_fetch.controllers;

import com.kopiko.rest_js_fetch.rest_js_fetch.exception_handling.NoSuchUserException;
import com.kopiko.rest_js_fetch.rest_js_fetch.models.User;
import com.kopiko.rest_js_fetch.rest_js_fetch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class MyRestController {

    private final UserService userService;

    @Autowired
    public MyRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/users")
    public List<User> getALlUsers() {
        return userService.findAll();
    }

    @GetMapping("/api/users/{id}")
    public User getOneUser(@PathVariable int id) {
        User user = userService.findById(id);
        if (user == null) {
            throw new NoSuchUserException("There is no user with ID = " +
                    " in Database");
        }
        return user;
    }

    @PostMapping("/api/users")
    public User addUser(@RequestBody User user) {
        userService.save(user);
        return user;
    }

    @PutMapping("/api/users")
    public User updateUser(@RequestBody User user) {
        userService.save(user);
        return user;
    }

    @DeleteMapping("/api/users/{id}")
    public String deleteUser(@PathVariable int id) {
        User user = userService.findById(id);
        if (user == null) {
            throw new NoSuchUserException("There is no user with ID = " +
                    " in Database");
        }
        userService.deleteById(id);
        return "User with ID = " + " was deleted";
    }
}
