package com.interview.interview.repository;

import com.interview.interview.entity.ImageClass;
import com.interview.interview.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Integer> {

}
