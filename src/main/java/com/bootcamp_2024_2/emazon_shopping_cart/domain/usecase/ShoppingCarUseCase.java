package com.bootcamp_2024_2.emazon_shopping_cart.domain.usecase;

import com.bootcamp_2024_2.emazon_shopping_cart.domain.api.IShoppingCarServicePort;
import com.bootcamp_2024_2.emazon_shopping_cart.domain.model.ShoppingCar;
import com.bootcamp_2024_2.emazon_shopping_cart.domain.spi.IShoppingCarPersistencePort;
import com.bootcamp_2024_2.emazon_shopping_cart.infrastructure.exception.ShoppingCarNotFoundException;

public class ShoppingCarUseCase implements IShoppingCarServicePort {

    private final IShoppingCarPersistencePort shoppingCarPersistencePort;

    public ShoppingCarUseCase(IShoppingCarPersistencePort shoppingCarPersistencePort) {
        this.shoppingCarPersistencePort = shoppingCarPersistencePort;
    }

    @Override
    public ShoppingCar findById(Long id) {
        return shoppingCarPersistencePort.findById(id)
                .orElseThrow(ShoppingCarNotFoundException::new);
    }

    @Override
    public ShoppingCar save(ShoppingCar shoppingCar) {
        return shoppingCarPersistencePort.save(shoppingCar);
    }
}
