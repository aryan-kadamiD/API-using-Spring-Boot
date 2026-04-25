package com.example.newborn;

public class MessageResponse {
    private String status;
    private String content;

    public MessageResponse(String status, String content) {
        this.status = status;
        this.content = content;
    }

    // getter methods
    public String getStatus() { return status; }
    public String getContent() { return content; }
}