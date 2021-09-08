package com.rb.productservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @PostMapping("inventory/{count}/deduction")
    public void deductProduct(@PathVariable final String count) {
        System.out.println("product-service: 扣除库存-" + count);
    }
}
