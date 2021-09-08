package com.rb.orderservice.controller;

import com.rb.orderservice.api.DemoApi;
import com.rb.orderservice.service.OrderService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(final OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("{count}")
    public void submitOrder(@PathVariable final int count) {
        orderService.submitOrder(count);
    }
}
