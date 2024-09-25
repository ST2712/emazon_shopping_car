package com.bootcamp_2024_2.emazon_shopping_cart.infrastructure.out.jpa.adapter;

import com.bootcamp_2024_2.emazon_shopping_cart.domain.model.ShoppingCar;
import com.bootcamp_2024_2.emazon_shopping_cart.domain.spi.IShoppingCarPersistencePort;
import com.bootcamp_2024_2.emazon_shopping_cart.infrastructure.out.jpa.entity.ShoppingCarEntity;
import com.bootcamp_2024_2.emazon_shopping_cart.infrastructure.out.jpa.mapper.ShoppingCarEntityMapper;
import com.bootcamp_2024_2.emazon_shopping_cart.infrastructure.out.jpa.repository.IShoppingCarRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class ShoppingCarJpaAdapter implements IShoppingCarPersistencePort {

    private final IShoppingCarRepository shoppingCarRepository;
    private final ShoppingCarEntityMapper shoppingCarEntityMapper;

    @Override
    public Optional<ShoppingCar> findById(Long id) {
        Optional<ShoppingCarEntity> shoppingCarOptional = shoppingCarRepository.findById(id);
        return shoppingCarOptional.map(shoppingCarEntityMapper::toShoppingCar);
    }

    @Override
    public ShoppingCar save(ShoppingCar shoppingCar) {
        ShoppingCarEntity shoppingCarEntity = shoppingCarEntityMapper.toEntity(shoppingCar);
        ShoppingCarEntity savedShoppingCarEntity = shoppingCarRepository.save(shoppingCarEntity);
        return shoppingCarEntityMapper.toShoppingCar(savedShoppingCarEntity);
    }
}
