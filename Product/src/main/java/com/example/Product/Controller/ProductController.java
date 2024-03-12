package com.example.Product.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.jsf.FacesContextUtils;

import com.example.Product.DTO.FakestoreProductDto;
import com.example.Product.Service.ProductService;
import com.example.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
public class ProductController {
    
    ProductService ps ;
    ProductController(ProductService ps){ // ye contructor bn diya for "DEPENDENCY INJECTION" ab ye hr jagah use ho
        this.ps = ps;
    }

    @GetMapping("/carts/")
    public FakestoreProductDto[] getAllCarts(){
       
        return ps.getAllCarts();
    }

    @GetMapping("/carts/{id}")
    public FakestoreProductDto getCartByID(@PathVariable Long id) {  // isse liye input or de diya service ko
        return ps.getCartByID(id);
    }
    
    @GetMapping("/carts/date/{date}")
    public FakestoreProductDto getCartInDateRange(@PathVariable String date) {  
        return ps.getCartInDateRange(date);
    }
    @GetMapping("/carts/user/{id}")
    public FakestoreProductDto getUserCart(@PathVariable Long id) {
        return ps.getUserCart(id);
    }
    @PostMapping("/carts")
    public FakestoreProductDto AddNewProduct(@RequestBody FakestoreProductDto Product) { 
        return ps.AddNewProduct(Product);
    }
    @PutMapping("/carts/{id}")
    public FakestoreProductDto UpdateProduct(@PathVariable Long id, @RequestBody FakestoreProductDto Product) { 
        return ps.UpdateProduct(id, Product);
        }
    @DeleteMapping("/carts/{id}")
    public void DeleteCart(@PathVariable Long id) { 
        ps.DeleteCart(id);
    }
    
}
