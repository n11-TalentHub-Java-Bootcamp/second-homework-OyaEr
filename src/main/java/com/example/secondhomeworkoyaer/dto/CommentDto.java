package com.example.secondhomeworkoyaer.dto;

import java.math.BigDecimal;
import java.util.Date;

//Bu class bir ürünün yorumlarının DTO'su için yazılmıştır.

public class CommentDto {

    public CommentDto(Long id, String comment, Date commentDate, Long productId, Long userId) {
        this.id = id;
        this.comment = comment;
        this.commentDate = commentDate;
        this.productId = productId;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    private Long id;
    private String comment;
    private Date commentDate;
    private Long productId;
    private Long userId;

}
