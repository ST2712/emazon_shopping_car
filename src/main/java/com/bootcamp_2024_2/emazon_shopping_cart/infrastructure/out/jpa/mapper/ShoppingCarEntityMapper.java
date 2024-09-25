package com.bootcamp_2024_2.emazon_shopping_cart.infrastructure.out.jpa.mapper;

import com.bootcamp_2024_2.emazon_shopping_cart.domain.model.ShoppingCar;
import com.bootcamp_2024_2.emazon_shopping_cart.infrastructure.out.jpa.entity.ShoppingCarEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ShoppingCarEntityMapper {
    ShoppingCar toShoppingCar(ShoppingCarEntity shoppingCarEntity);
    ShoppingCarEntity toEntity(ShoppingCar shoppingCar);
}
