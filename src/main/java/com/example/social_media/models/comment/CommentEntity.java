package com.example.social_media.models.comment;

import com.example.social_media.models.post.PostEntity;
import com.example.social_media.models.user.UserEntity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "comment")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Comment text cannot be empty")
    @Size(min = 2, max = 128, message = "Comment text must be 2-128 characters")
    @Column(name = "text")
    private String text;

    @ManyToOne(optional = false)
    @JoinColumn(name = "post_id")
    private PostEntity post;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    public CommentEntity() {
    }

    public CommentEntity(Long id, String text, PostEntity post, UserEntity user) {
        this.id = id;
        this.text = text;
        this.post = post;
        this.user = user;
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

    public PostEntity getPost() {
        return post;
    }

    public void setPost(PostEntity post) {
        this.post = post;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}