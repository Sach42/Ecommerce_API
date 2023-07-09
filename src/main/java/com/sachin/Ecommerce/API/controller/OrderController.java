package com.sachin.Ecommerce.API.controller;

import com.sachin.Ecommerce.API.model.Order;
import com.sachin.Ecommerce.API.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order createOrder(
            @RequestParam Integer userId,
            @RequestParam Integer productId,
            @RequestParam Integer addressId,
            @RequestParam Integer productQuantity
    ) {
        return orderService.createOrder(userId, productId, addressId, productQuantity);
    }

    @GetMapping("/{orderId}")
    public Order getOrderById(@PathVariable Integer orderId) {
        return orderService.getOrderById(orderId);
    }
}
