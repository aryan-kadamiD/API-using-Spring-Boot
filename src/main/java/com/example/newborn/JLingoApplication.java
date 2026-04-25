package com.example.newborn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class JLingoApplication {

    public static void main(String[] args) {

        SpringApplication.run(JLingoApplication.class, args);
    }

    @GetMapping("/word-of-the-day")
    public Map<String, Object> getDailyWord() {
        word word = new word("勉強", "Benkyou", "Study");

        // Using a Map to add extra "flavor" to the JSON
        Map<String, Object> response = new HashMap<>();
        response.put("date", "2026-04-26");
        response.put("lesson_number", 1);
        response.put("data", word);
        response.put("status", "success");

        return response;
    }

    @GetMapping("/word-of-the-day")
    public List<word> getFullDictionary() {
        // 2. We are returning a LIST of Word objects now
        return List.of(
                new word("勉強", "Benkyou", "Study"),
                new word("猫", "Neko", "Cat"),
                new word("火曜日", "Kayoubi", "Tuesday")
        );
    }
}