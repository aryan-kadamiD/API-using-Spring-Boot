package com.example.newborn;

import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.type.TypeReference; // Use com.fasterxml
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;

@Service
public class DictionaryService {

    private final ObjectMapper mapper = new ObjectMapper();

    public List<Word> getN5Dictionary() {
        try {
            // Load from src/main/resources/words.json
            InputStream inputStream = getClass().getResourceAsStream("/words.json");

            if (inputStream == null) {
                System.out.println("Error: words.json not found in resources!");
                return List.of();
            }

            return mapper.readValue(inputStream, new TypeReference<List<Word>>() {});
        } catch (Exception e) {
            e.printStackTrace(); // Log the actual error to see what's wrong
            return List.of();
        }
    }
}