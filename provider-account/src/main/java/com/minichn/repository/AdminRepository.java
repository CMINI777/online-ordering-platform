package com.minichn.repository;

import com.minichn.entity.Admin;

public interface AdminRepository {
    public Admin login(String username, String password);
}
