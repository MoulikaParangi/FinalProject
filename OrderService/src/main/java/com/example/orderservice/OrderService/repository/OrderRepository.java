package com.example.orderservice.OrderService.repository;

import com.example.orderservice.OrderService.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {

}
