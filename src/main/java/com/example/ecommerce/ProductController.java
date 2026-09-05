package com.example.ecommerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products")
    public String getProducts() {
        return "Product 1: Laptop | Product 2: Mobile | Product 3: Headphones";
    }

    @GetMapping("/")
    public String home() {
        return "E-Commerce Application is Running!";
    }
}
