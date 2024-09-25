package com.bootcamp_2024_2.emazon_shopping_cart.infrastructure.configuration;

import com.bootcamp_2024_2.emazon_shopping_cart.domain.api.IShoppingCarServicePort;
import com.bootcamp_2024_2.emazon_shopping_cart.domain.spi.IShoppingCarPersistencePort;
import com.bootcamp_2024_2.emazon_shopping_cart.domain.usecase.ShoppingCarUseCase;
import com.bootcamp_2024_2.emazon_shopping_cart.infrastructure.out.jpa.adapter.ShoppingCarJpaAdapter;
import com.bootcamp_2024_2.emazon_shopping_cart.infrastructure.out.jpa.mapper.ShoppingCarEntityMapper;
import com.bootcamp_2024_2.emazon_shopping_cart.infrastructure.out.jpa.repository.IShoppingCarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IShoppingCarRepository shoppingCarRepository;
    private final ShoppingCarEntityMapper shoppingCarEntityMapper;

    @Bean
    public IShoppingCarServicePort shoppingCarServicePort() {
        return new ShoppingCarUseCase(shoppingCarPersistencePort());
    }

    @Bean
    public IShoppingCarPersistencePort shoppingCarPersistencePort() {
        return new ShoppingCarJpaAdapter(shoppingCarRepository, shoppingCarEntityMapper);
    }
}
