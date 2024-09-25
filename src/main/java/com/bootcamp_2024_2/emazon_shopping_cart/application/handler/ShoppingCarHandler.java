package com.bootcamp_2024_2.emazon_shopping_cart.application.handler;

import com.bootcamp_2024_2.emazon_shopping_cart.application.dto.request.ShoppingCarRequest;
import com.bootcamp_2024_2.emazon_shopping_cart.application.dto.response.ShoppingCarResponse;
import com.bootcamp_2024_2.emazon_shopping_cart.application.mapper.ShoppingCarRequestMapper;
import com.bootcamp_2024_2.emazon_shopping_cart.application.mapper.ShoppingCarResponseMapper;
import com.bootcamp_2024_2.emazon_shopping_cart.domain.api.IShoppingCarServicePort;
import com.bootcamp_2024_2.emazon_shopping_cart.domain.model.ShoppingCar;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class ShoppingCarHandler implements IShoppingCarHandler {

    private final IShoppingCarServicePort shoppingCarServicePort;
    private final ShoppingCarRequestMapper shoppingCarRequestMapper;
    private final ShoppingCarResponseMapper shoppingCarResponseMapper;

    @Override
    public ShoppingCarResponse findById(Long id) {
        ShoppingCar shoppingCar = shoppingCarServicePort.findById(id);
        return shoppingCarResponseMapper.toResponse(shoppingCar);
    }

    @Override
    public ShoppingCarResponse save(ShoppingCarRequest shoppingCar) {
        return shoppingCarResponseMapper.toResponse(
                shoppingCarServicePort.save(shoppingCarRequestMapper.toShoppingCar(shoppingCar)));
    }
}
