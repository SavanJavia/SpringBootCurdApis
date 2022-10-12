package com.interview.interview.service;

import com.interview.interview.entity.Inventory;
import com.interview.interview.repository.InventoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;


    public Inventory addInventory(Inventory inventory) {
        log.info("Inventory Adding...");
        return inventoryRepository.save(inventory);
    }

    public Inventory updateInventory(Inventory inventory) {
        log.info("Inventory Updating...");
        Inventory i = inventoryRepository.findById(inventory.getId()).get();
        i.setStatus(inventory.getStatus());
        i.setStock(inventory.getStock());
        i.setFlag(inventory.isFlag());
        i.setName(inventory.getName());
        return inventoryRepository.save(i);
    }

    public List<Inventory> getAllInventory() {
        log.info("Get All Inventory Details...");
        return inventoryRepository.findAll();
    }

    public String deleteInventory(int id) {
         log.info("Delete Inventory By Id..."+id);
         inventoryRepository.deleteById(id);
         return "delete done !!";
    }

    public int getInventoryStock(int id) {
        log.info("Get Inventory By Id..."+id);
        Inventory i = inventoryRepository.findById(id).get();
        return i.getStock();
    }
}
