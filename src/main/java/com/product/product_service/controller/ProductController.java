package com.product.product_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/getProduct/{productId}")
    public String getProduct(@PathVariable("productId") String productId) {
        return productId+" is fetched successfully";
    }
}
