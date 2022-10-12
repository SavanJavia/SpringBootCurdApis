package com.interview.interview.controller;

import com.interview.interview.entity.Inventory;
import com.interview.interview.service.InventoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    InventoryService inventoryService;


    @GetMapping("/testInventory")
    public String testingInventory(){
        return "CAll inventory controller !! ";
    }

    @PostMapping("/addInventory")
    public ResponseEntity<Inventory> addInventory(@RequestBody Inventory inventory){
        Inventory response = inventoryService.addInventory(inventory);
        log.info("Inventory added sucessfully"+response);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }


    @PutMapping("/updateInventory")
    public ResponseEntity<Inventory> updateInventory(@RequestBody Inventory inventory){
        Inventory response = inventoryService.updateInventory(inventory);
        log.info("Image updated sucessfully"+response);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }


    @GetMapping("/getAllInventory")
    public ResponseEntity<List<Inventory>> getAllInventory(){
        List<Inventory> response = inventoryService.getAllInventory();
        log.info("Get all inventory sucessfully");
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }


    @DeleteMapping("/deleteInventory/{id}")
    @ResponseBody
    public ResponseEntity<String> deleteInventoryById(@PathVariable int id){
        String response = inventoryService.deleteInventory(id);
        log.info("Delete inventory sucessfully"+response);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/getInventoryStock/{id}")
    @ResponseBody
    public ResponseEntity<Integer> getInventoryStockById(@PathVariable int id){
        Integer response = inventoryService.getInventoryStock(id);
        log.info("Get inventory stock sucessfully"+response);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
