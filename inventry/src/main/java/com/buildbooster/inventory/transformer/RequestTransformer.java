package com.buildbooster.inventory.transformer;

import org.springframework.stereotype.Service;

import com.buildbooster.inventory.model.InventoryModel;
import com.buildbooster.inventory.request.InventoryRequest;

@Service
public class RequestTransformer {

	public InventoryModel transformInventryRequest(InventoryRequest inventoryModelRequest) {
		InventoryModel inventoryModel = new InventoryModel();
		
		inventoryModel.setInventoryItemId(inventoryModelRequest.getInventoryItemId());

		inventoryModel.setProductId(inventoryModelRequest.getProductId());

		inventoryModel.setInventoryItemTypeId(inventoryModelRequest.getInventoryItemTypeId());

		inventoryModel.setCompanyId(inventoryModelRequest.getCompanyId());

		inventoryModel.setcUserId(inventoryModelRequest.getCUserId());

		inventoryModel.setDatetimeReceived(inventoryModelRequest.getDatetimeReceived());

		inventoryModel.setFacilityId(inventoryModelRequest.getFacilityId());

		inventoryModel.setLotId(inventoryModelRequest.getLotId());

		inventoryModel.setUomId(inventoryModelRequest.getUomId());

		inventoryModel.setComments(inventoryModelRequest.getComments());

		inventoryModel.setQuantityOnHandTotal(inventoryModelRequest.getQuantityOnHandTotal());

		inventoryModel.setUnitCost(inventoryModelRequest.getUnitCost());

		inventoryModel.setCreatedDate(inventoryModelRequest.getCreatedDate());

		inventoryModel.setThresholdQuantityValue(inventoryModelRequest.getThresholdQuantityValue());
		
		return inventoryModel;

	}

}
