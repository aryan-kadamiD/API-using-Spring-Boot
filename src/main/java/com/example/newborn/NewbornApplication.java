package com.example.newborn;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Tells Spring this class handles API requests
public class NewbornApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewbornApplication.class, args);
    }

    @GetMapping("/hello") // This is the "URL" path
    public String sayHello() {
        return "System Online. Let's break something.";
    }
}