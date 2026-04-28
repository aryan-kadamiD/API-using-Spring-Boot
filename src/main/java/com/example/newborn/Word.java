package com.example.newborn;

public class Word {
    private String hiragana;
    private String romaji;
    private String english;

    // 1. You MUST have a default constructor for Jackson
    public Word() {}

    public Word(String hiragana, String romaji, String english) {
        this.hiragana = hiragana;
        this.romaji = romaji;
        this.english = english;
    }

    // Getters
    public String getHiragana() { return hiragana; }
    public String getRomaji() { return romaji; }
    public String getEnglish() { return english; }

    // 2. Add Setters (Jackson uses these to fill the object)
    public void setHiragana(String hiragana) { this.hiragana = hiragana; }
    public void setRomaji(String romaji) { this.romaji = romaji; }
    public void setEnglish(String english) { this.english = english; }
}