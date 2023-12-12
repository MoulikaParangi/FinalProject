package com.example.inventoryService.InventoryService.service;

import com.example.inventoryService.InventoryService.model.Inventory;
import com.example.inventoryService.InventoryService.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    public boolean isProductInStock(String prodcutName)
    {
        return true;

    }



}
