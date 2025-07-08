package com.example.social_media.models.comment;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CommentRequest {
    @NotBlank(message = "Comment text cannot be empty")
    @Size(min = 2, max = 128, message = "Comment text must be 2-128 characters")
    private String text;

    @NotNull(message = "Post ID cannot be null")
    private Long postId;

    public CommentRequest() {
    }

    public CommentRequest(String text, Long postId) {
        this.text = text;
        this.postId = postId;
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
}