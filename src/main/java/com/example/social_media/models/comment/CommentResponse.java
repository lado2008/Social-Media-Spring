package com.example.social_media.models.comment;

public class CommentResponse {
    private Long id;
    private String text;
    private Long postId;
    private String username;

    public CommentResponse() {
    }

    public CommentResponse(Long id, String text, Long postId, String username) {
        this.id = id;
        this.text = text;
        this.postId = postId;
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

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
