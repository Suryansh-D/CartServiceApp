package com.example.Product.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.*;
import com.example.Product.DTO.FakestoreProductDto;
@Service
public class ProductService {

    RestTemplate restTemplate = new RestTemplate();

    String url = "https://fakestoreapi.com";





    public FakestoreProductDto[] getAllCarts(){ // isko bs out put return kkr dena hai product controller ko usi se input lekr
       
        var response = restTemplate.getForObject(url+"/carts/", FakestoreProductDto[].class);
        return response;
    }

    public FakestoreProductDto getCartByID(Long id){ // isko bs out put return kkr dena hai product controller ko usi se input lekr
        
        var response = restTemplate.getForObject(url+"/carts/"+id , FakestoreProductDto.class);
        return response;
    }

    public FakestoreProductDto getCartInDateRange(String date){ // isko bs out put return kkr dena hai product controller ko usi se input lekr
        
        var response = restTemplate.getForObject(url+"/carts/date/"+date , FakestoreProductDto.class);
        return response;
    }
    public FakestoreProductDto getUserCart(Long id){ 
       
        var response = restTemplate.getForObject(url+"/carts/user/"+id, FakestoreProductDto.class);
        return response;
    }
    public FakestoreProductDto AddNewProduct(FakestoreProductDto Product){ 
        var response = restTemplate.postForObject(url+"/carts", Product, FakestoreProductDto.class);
        return response;
    }
    public FakestoreProductDto UpdateProduct(Long id, FakestoreProductDto Product){ 
        restTemplate.put(url+"/carts/"+id, Product);
        return Product;
    }
    public void DeleteCart(Long id){ 
        restTemplate.delete(url+"/carts/"+id);
    }
}
