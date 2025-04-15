package com.example.helloservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @Value("${app.greeting}")
    private String greeting;

    @GetMapping("/hello")
    public Map<String, String> sayHello(@RequestParam(defaultValue = "mundo") String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", String.format("%s, %s! Bem-vindo ao mundo dos 12 fatores.", greeting, name));
        return response;
    }
}
