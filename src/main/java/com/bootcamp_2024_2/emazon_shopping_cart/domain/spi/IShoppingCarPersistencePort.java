package com.bootcamp_2024_2.emazon_shopping_cart.domain.spi;

import com.bootcamp_2024_2.emazon_shopping_cart.domain.model.ShoppingCar;

import java.util.Optional;

public interface IShoppingCarPersistencePort {
    Optional<ShoppingCar> findById(Long id);
    ShoppingCar save(ShoppingCar shoppingCar);
}
