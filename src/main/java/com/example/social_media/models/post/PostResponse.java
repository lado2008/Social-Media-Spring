package com.example.social_media.models.post;

public class PostResponse {
    private Long id;
    private String text;
    private String username;

    public PostResponse() {
    }

    public PostResponse(Long id, String text, String username) {
        this.id = id;
        this.text = text;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
