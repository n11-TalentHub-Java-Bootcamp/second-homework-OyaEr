package com.example.secondhomeworkoyaer.dto;

import java.math.BigDecimal;
import java.util.Date;

//Bu class bir ürünün yorumlarının DTO'su için yazılmıştır.

public class CommentDto {

    private Long id;
    private String productName;
    private String categoryName;
    private BigDecimal price;
    private String userName;
    private String userSurname;
    private String userEmail;
    private String userPhoneNumber;
    private String comment;
    private Date commentDate;

    public CommentDto(String productName, String categoryName, BigDecimal price, String userName, String userSurname, String userEmail, String userPhoneNumber, String comment, Date commentDate) {
        this.productName = productName;
        this.categoryName = categoryName;
        this.price = price;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userEmail = userEmail;
        this.userPhoneNumber = userPhoneNumber;
        this.comment = comment;
        this.commentDate = commentDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
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


    @Override
    public String toString() {
        return "ProductCommentDetailDto{" +
                "ürünAdı='" + productName + '\'' +
                ", kategoriAdı='" + categoryName + '\'' +
                ", fiyat=" + price +
                ", kullanıcıAdı='" + userName + '\'' +
                ", kullanıcı='" + userSurname + '\'' +
                ", kullanıcıEmaili='" + userEmail + '\'' +
                ", kullanıcıTelefon='" + userPhoneNumber + '\'' +
                ", yorum='" + comment + '\'' +
                ", yorumTarihi=" + commentDate +
                '}';
    }
}
