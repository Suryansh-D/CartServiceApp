package com.example.Product.DTO;

import java.util.*;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductsInCart {
    Long productId;
    Long quantity;
}
