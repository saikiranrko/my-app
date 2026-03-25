package com.lab.my_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyAppApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "my-app is running — org style DevOps lab";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }

    @GetMapping("/api/info")
    public String info() {
        return "{\"app\":\"my-app\",\"version\":\"1.0.0\",\"env\":\"" + 
               System.getenv().getOrDefault("APP_ENV", "local") + "\"}";
    }
}
