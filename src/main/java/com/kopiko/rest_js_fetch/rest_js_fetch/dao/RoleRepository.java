package com.kopiko.rest_js_fetch.rest_js_fetch.dao;

import com.kopiko.rest_js_fetch.rest_js_fetch.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
