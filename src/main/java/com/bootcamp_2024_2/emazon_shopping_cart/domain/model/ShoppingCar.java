package com.bootcamp_2024_2.emazon_shopping_cart.domain.model;

import java.time.LocalDateTime;

public class ShoppingCar {

    private long id;
    private long articleId;
    private long userId;
    private int quantity;
    private LocalDateTime updateDate;
    private LocalDateTime creationDate;

    public ShoppingCar(long id, long articleId, long userId, int quantity, LocalDateTime updateDate, LocalDateTime creationDate) {
        this.id = id;
        this.articleId = articleId;
        this.userId = userId;
        this.quantity = quantity;
        this.updateDate = updateDate;
        this.creationDate = creationDate;
    }

    public ShoppingCar(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
