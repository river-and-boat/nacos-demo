package com.rb.orderservice.service;

import com.rb.orderservice.api.ProductApi;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final ProductApi productApi;

    public OrderService(ProductApi productApi) {
        this.productApi = productApi;
    }

    public void submitOrder(int orderCount) {
        System.out.println("order-service: 提交商品订单数-" + orderCount);
        productApi.deductInventory(orderCount);
    }
}
