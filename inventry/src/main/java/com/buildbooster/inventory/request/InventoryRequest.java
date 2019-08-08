package com.buildbooster.inventory.request;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryRequest {
	
	
	 Long inventoryItemId;

	 Long productId;

	 Long inventoryItemTypeId;

	 Long companyId;

	 Long cUserId;

	 Date datetimeReceived;

	 Long facilityId;

	 Long lotId;

	 Long uomId;

	 String comments;

	 Integer quantityOnHandTotal;

	 Float unitCost;

	 Date createdDate;

	 Integer thresholdQuantityValue;
	

}
