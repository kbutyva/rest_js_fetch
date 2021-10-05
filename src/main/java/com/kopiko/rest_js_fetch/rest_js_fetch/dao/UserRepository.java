package com.kopiko.rest_js_fetch.rest_js_fetch.dao;

import com.kopiko.rest_js_fetch.rest_js_fetch.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User getUserByUsername(String username);
}
