package com.example.Product.DTO;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Getter
@Setter

public class Product {
    Long userId;
    Date date;
    ProductsInCart[] products;
}
