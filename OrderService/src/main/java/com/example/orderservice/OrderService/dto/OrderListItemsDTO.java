package com.example.orderservice.OrderService.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderListItemsDTO {

    private Integer ID;
    private String productID;
    private Integer quantity;
    private Integer price;

}
