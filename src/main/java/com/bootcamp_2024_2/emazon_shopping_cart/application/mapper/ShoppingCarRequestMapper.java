package com.bootcamp_2024_2.emazon_shopping_cart.application.mapper;

import com.bootcamp_2024_2.emazon_shopping_cart.application.dto.request.ShoppingCarRequest;
import com.bootcamp_2024_2.emazon_shopping_cart.domain.model.ShoppingCar;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ShoppingCarRequestMapper {
    ShoppingCar toShoppingCar(ShoppingCarRequest shoppingCarRequest);
}
