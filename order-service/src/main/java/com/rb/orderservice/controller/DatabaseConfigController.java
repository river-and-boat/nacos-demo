package com.rb.orderservice.controller;

import com.rb.orderservice.config.DatabaseConfig;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseConfigController {
    private final DatabaseConfig config;

    public DatabaseConfigController(final DatabaseConfig config) {
        this.config = config;
    }

    @GetMapping("database/config")
    public Map<String, String> getDatabaseConfig() {
        Map<String, String> result = new HashMap<>();
        result.put("url", config.getUrl());
        result.put("username", config.getUsername());
        result.put("password", config.getPassword());
        return result;
    }
}
