package com.example.newborn;

public class word {
    private String kanji;
    private String romaji;
    private String english;

    public word(String kanji, String romaji, String english) {
        this.kanji = kanji;
        this.romaji = romaji;
        this.english = english;
    }

    // Getters are still needed for the API
    public String getKanji() { return kanji; }
    public String getRomaji() { return romaji; }
    public String getEnglish() { return english; }
}

