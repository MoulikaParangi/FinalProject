package com.example.inventoryService.InventoryService.repository;

import com.example.inventoryService.InventoryService.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
}
