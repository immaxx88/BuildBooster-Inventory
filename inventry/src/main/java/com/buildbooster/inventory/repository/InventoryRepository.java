package com.buildbooster.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buildbooster.inventory.model.InventoryModel;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryModel, Long> {

}
