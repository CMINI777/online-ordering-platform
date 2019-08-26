package com.minichn.repository;

import com.minichn.entity.User;

public interface UserRepository {
    public User login(String username, String password);
}
