package com.example.inventoryService.InventoryService.controller;


import com.example.inventoryService.InventoryService.service.InventoryService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/inventoryservice")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/{productName}")
    public boolean inventoryServiceStatus(@PathVariable String productName)
    {
      return inventoryService.isProductInStock(productName);
    }
}
