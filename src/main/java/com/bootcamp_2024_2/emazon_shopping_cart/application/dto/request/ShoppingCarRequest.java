package com.bootcamp_2024_2.emazon_shopping_cart.application.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ShoppingCarRequest {

    private long id;
    private long articleId;
    private long userId;
    private int quantity;
    private LocalDate updateDate;
    private LocalDate creationDate;
}
