package com.jcmunozo.RestBook.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String welcome() {
        return """
                    <h1>Welcome to the RestBook API</h1>
                    <p>This is the landing page for our RestBook API. Here you can find links to our API documentation and other resources.</p>
                    <a href="/swagger" class="button">View API Documentation</a>
                    <br>
                    <a href="/info" class="button">API Info</a>
            """;
    }

    @GetMapping("/info")
    public Map<String, String> info() {
        Map<String, String> info = new HashMap<>();
        info.put("name", "RestBook API");
        info.put("version", "1.0");
        info.put("description", "A RESTful API for managing books");
        return info;
    }
}
