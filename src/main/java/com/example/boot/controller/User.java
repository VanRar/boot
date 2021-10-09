package com.example.boot.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "boot")
public class User {
    private String username;
    private int password;

    public String getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
