package com.kopiko.rest_js_fetch.rest_js_fetch.service;

import com.kopiko.rest_js_fetch.rest_js_fetch.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;


import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> findAll();

    void save(User user);

    User findById(int id);

    void deleteById(int id);

    User getUserByUsername(String username);
}
