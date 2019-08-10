package com.buildbooster.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.buildbooster.inventory.model.InventoryModel;
import com.buildbooster.inventory.response.InventoryResponse;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryModel, Long> {

	@Query("From InventoryModel itm where itm.companyId=:companyid")
	public List<InventoryModel> getCompanyInventory(Long companyid);

	@Query("From InventoryModel itm where itm.companyId=:companyid and itm.facilityId=:facilityid")
	public List<InventoryModel> getFacilityInventory(Long companyid, Long facilityid);
	
	@Query("From InventoryModel itm where itm.companyId=:companyid and itm.facilityId=:facilityid and itm.inventoryItemId=:inventoryitemid")
	public InventoryModel getFacilityItem(Long companyid, Long facilityid, Long inventoryitemid);
}
