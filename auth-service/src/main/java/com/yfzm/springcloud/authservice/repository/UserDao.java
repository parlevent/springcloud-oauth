package com.yfzm.springcloud.authservice.repository;

import com.yfzm.springcloud.authservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
