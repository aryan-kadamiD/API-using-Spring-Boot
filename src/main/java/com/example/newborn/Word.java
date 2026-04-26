package com.example.newborn;

public class Word {
    private String hiragana; // Changed from kanji
    private String romaji;
    private String english;

    public Word(String hiragana, String romaji, String english) {
        this.hiragana = hiragana;
        this.romaji = romaji;
        this.english = english;
    }

    // Getters must match the new field name
    public String getHiragana() { return hiragana; }
    public String getRomaji() { return romaji; }
    public String getEnglish() { return english; }
}