package com.example.orderservice.OrderService.controller;

import com.example.orderservice.OrderService.dto.OrderRequest;
import com.example.orderservice.OrderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orderservice")
public class OrderController {

    @Autowired
    private OrderService orderService;
@PostMapping("/neworder")
    public String takeOrder(@RequestBody OrderRequest orderRequest)
    {
  orderService.addOrder(orderRequest);
  return "order placed successfully";
    }

}
