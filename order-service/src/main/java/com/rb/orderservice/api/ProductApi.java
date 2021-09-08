package com.rb.orderservice.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "product-service")
public interface ProductApi {
    @PostMapping("/inventory/{count}/deduction")
    void deductInventory(@PathVariable final int count);
}
