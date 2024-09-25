package com.bootcamp_2024_2.emazon_shopping_cart.infrastructure.out.jpa.repository;

import com.bootcamp_2024_2.emazon_shopping_cart.infrastructure.out.jpa.entity.ShoppingCarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IShoppingCarRepository extends JpaRepository<ShoppingCarEntity, Long> {
}
