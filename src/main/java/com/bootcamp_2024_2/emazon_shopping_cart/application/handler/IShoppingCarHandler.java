package com.bootcamp_2024_2.emazon_shopping_cart.application.handler;

import com.bootcamp_2024_2.emazon_shopping_cart.application.dto.request.ShoppingCarRequest;
import com.bootcamp_2024_2.emazon_shopping_cart.application.dto.response.ShoppingCarResponse;

public interface IShoppingCarHandler {
    ShoppingCarResponse findById(Long id);
    ShoppingCarResponse save(ShoppingCarRequest shoppingCar);
}
