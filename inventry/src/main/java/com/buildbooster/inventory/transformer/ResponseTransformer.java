package com.buildbooster.inventory.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buildbooster.inventory.model.InventoryModel;
import com.buildbooster.inventory.response.InventoryResponse;

@Service
public class ResponseTransformer {
	
//	@Autowired
//	InventoryModel inventoryModel;

	public InventoryResponse convertToResponse(InventoryModel inventoryModel) {
		
		InventoryResponse inventoryResponse = new InventoryResponse();
		
		inventoryResponse.setInventoryItemId(inventoryModel.getInventoryItemId());
		
		inventoryResponse.setProductId(inventoryModel.getProductId());

		inventoryResponse.setInventoryItemTypeId(inventoryModel.getInventoryItemTypeId());
		
		inventoryResponse.setCompanyId(inventoryModel.getCompanyId());
		
		inventoryResponse.setcUserId(inventoryModel.getcUserId());
		
		inventoryResponse.setDatetimeReceived(inventoryModel.getDatetimeReceived());
		
		inventoryResponse.setFacilityId(inventoryModel.getFacilityId());
		
		inventoryResponse.setLotId(inventoryModel.getLotId());
		
		inventoryResponse.setUomId(inventoryModel.getUomId());
		
		inventoryResponse.setComments(inventoryModel.getComments());
		
		inventoryResponse.setQuantityOnHandTotal(inventoryModel.getQuantityOnHandTotal());

		inventoryResponse.setUnitCost(inventoryModel.getUnitCost());
		
		inventoryResponse.setCreatedDate(inventoryModel.getCreatedDate());
		
		inventoryResponse.setThresholdQuantityValue(inventoryModel.getThresholdQuantityValue());
		
	
		// TODO Auto-generated method stub
		return null;
	}

}
