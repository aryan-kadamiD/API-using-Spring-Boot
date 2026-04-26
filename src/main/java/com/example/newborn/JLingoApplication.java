package com.example.newborn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@SpringBootApplication
@RestController
public class JLingoApplication {
    private final DictionaryService dictionaryService;

    public JLingoApplication(DictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    // ADD THIS SECTION BELOW
    public static void main(String[] args) {
        SpringApplication.run(JLingoApplication.class, args);
    }

    @GetMapping("/dictionary")
    public List<Word> getDictionary() {
        return dictionaryService.getN5Dictionary();
    }
}