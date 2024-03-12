package com.example.Product.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.Product.Service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController //ye help krta hai for accepting request from the client
public class ArticleController {
    
    @GetMapping("/articles/")
    public String getAllArticles(){
        return "All Articles";

    }
     @GetMapping("/articles/{id}")
    public String getProductByID(@PathVariable Long id) {
        return "<h1>Mujhe pta hai , tum Article ki ID likhne vale the </h1>: " + id;
    }
    }
    

