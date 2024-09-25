package com.bootcamp_2024_2.emazon_shopping_cart.domain.api;

import com.bootcamp_2024_2.emazon_shopping_cart.domain.model.ShoppingCar;

public interface IShoppingCarServicePort {
    ShoppingCar findById(Long id);
    ShoppingCar save(ShoppingCar shoppingCar);
}
