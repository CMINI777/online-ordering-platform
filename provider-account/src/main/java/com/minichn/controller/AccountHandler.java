package com.minichn.controller;

import com.minichn.entity.Account;
import com.minichn.repository.AdminRepository;
import com.minichn.repository.UserRepository;
import com.minichn.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountHandler {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/login/{username}/{password}/{type}")
    public Account login(@PathVariable("username") String username,@PathVariable("password") String password,@PathVariable("type") String type){
        Account account = null;
        switch (type){
            case "user":
                account = userRepository.login(username, MD5Util.MD5EncodeUtf8(password));
                break;
            case "admin":
                account = adminRepository.login(username, MD5Util.MD5EncodeUtf8(password));
                break;
        }
        return account;
    }
}
