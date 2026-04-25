package com.example.newborn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NewbornApplication {
    public static void main(String[] args){
        SpringApplication.run(NewbornApplication.class, args);
    }
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "Stranger") String name){
        return "System Online. Hello," + name +"!\tlet's try to break it!";
    }
    @GetMapping("/json")
    public MessageResponse getJsonResponse() {
        return new MessageResponse("Success", "This is a real JSON response!");
    }
}