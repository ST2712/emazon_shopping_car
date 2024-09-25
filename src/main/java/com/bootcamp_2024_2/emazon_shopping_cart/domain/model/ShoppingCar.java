package com.bootcamp_2024_2.emazon_shopping_cart.domain.model;

import java.time.LocalDate;

public class ShoppingCar {

    private long id;
    private long articleId;
    private long userId;
    private int quantity;
    private LocalDate updateDate;
    private LocalDate creationDate;
}
