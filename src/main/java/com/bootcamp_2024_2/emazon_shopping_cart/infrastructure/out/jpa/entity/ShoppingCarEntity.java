package com.bootcamp_2024_2.emazon_shopping_cart.infrastructure.out.jpa.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shopping_cars")
public class ShoppingCarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long articleId;
    private long userId;
    private int quantity;
    private LocalDateTime updateDate;
    private LocalDateTime creationDate;
}
