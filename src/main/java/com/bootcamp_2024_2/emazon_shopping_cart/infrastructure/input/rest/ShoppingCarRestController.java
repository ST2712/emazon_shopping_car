package com.bootcamp_2024_2.emazon_shopping_cart.infrastructure.input.rest;

import com.bootcamp_2024_2.emazon_shopping_cart.application.dto.request.ShoppingCarRequest;
import com.bootcamp_2024_2.emazon_shopping_cart.application.dto.response.ShoppingCarResponse;
import com.bootcamp_2024_2.emazon_shopping_cart.application.handler.ShoppingCarHandler;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/shopping_cart")
public class ShoppingCarRestController {

    private final ShoppingCarHandler shoppingCarHandler;

    @GetMapping(path = "/v1/shopping_cart/{id}")
    public ShoppingCarResponse getShoppingCar(@PathVariable Long id) {
        return shoppingCarHandler.findById(id);
    }

    @PostMapping(path = "/v1/shopping_cart")
    public ShoppingCarResponse saveShoppingCart(@Valid @RequestBody ShoppingCarRequest request) {
        return shoppingCarHandler.save(request);
    }

}
