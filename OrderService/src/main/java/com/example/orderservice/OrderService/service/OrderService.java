package com.example.orderservice.OrderService.service;

import com.example.orderservice.OrderService.dto.OrderListItemsDTO;
import com.example.orderservice.OrderService.dto.OrderRequest;
import com.example.orderservice.OrderService.model.Order;
import com.example.orderservice.OrderService.model.OrderListItems;
import com.example.orderservice.OrderService.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void addOrder(OrderRequest orderRequest)
    {
       Order order=new Order();
       order.setOrderNumber(UUID.randomUUID().toString());
       List<OrderListItems> orderListItemsList=orderRequest.getOrderListItemsDTOList().stream()
               .map(this:: mapToDto).toList();
       order.setOrderitems(orderListItemsList);
       orderRepository.save(order);
    }

    private OrderListItems mapToDto(OrderListItemsDTO orderListItemsDTO) {
      OrderListItems orderListItems=new OrderListItems();
      orderListItems.setProductCode(orderListItemsDTO.getProductID());
      orderListItems.setPrice(orderListItemsDTO.getPrice());
      orderListItems.setQuantity(orderListItemsDTO.getQuantity());
      return orderListItems;


    }
}
