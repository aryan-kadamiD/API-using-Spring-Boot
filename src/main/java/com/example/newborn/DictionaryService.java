package com.example.newborn;

import org.springframework.stereotype.Service;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;

@Service
public class DictionaryService {
    public List<Word> getN5Dictionary() {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Word>> typeReference = new TypeReference<List<Word>>() {
        };
        InputStream inputStream = TypeReference.class.getResourceAsStream("/words.json");
        try {
            return mapper.readValue(inputStream, typeReference);
        } catch (Exception e) {
            System.out.println("Unable to load words: " + e.getMessage());
            return List.of(); // Return empty list if file fails to load
        }
    }
}