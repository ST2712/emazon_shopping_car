package com.bootcamp_2024_2.emazon_shopping_cart.infrastructure.exceptionhandler;

import lombok.Getter;

@Getter
public enum ExceptionResponse {

    SHOPPING_CART_NOT_FOUND("ERR_SHOPPING_CART_001", "Shopping cart not found."),
    INVALID_SHOPPING_CART("ERR_SHOPPING_CART_002", "Invalid shopping cart parameters."),
    GENERIC_ERROR("ERR_GENERIC_001", "An unexpected error occurred.");

    private final String code;
    private final String message;

    ExceptionResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
