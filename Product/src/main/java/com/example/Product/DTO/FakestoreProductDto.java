package com.example.Product.DTO;
import java.util.*;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakestoreProductDto {
    Long id;
    String userId;
    Date date;
    List <ProductsInCart> products;

    public Long getId(){
        return id;
    }
}
