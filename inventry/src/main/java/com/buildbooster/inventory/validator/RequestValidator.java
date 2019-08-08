package com.buildbooster.inventory.validator;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.buildbooster.inventory.exception.ErrorCodes;
import com.buildbooster.inventory.exception.InventoryServiceException;
import com.buildbooster.inventory.request.InventoryRequest;

@Component
public class RequestValidator {

	public void checkInventryRequest(String arg1) throws InventoryServiceException {
		// TODO Auto-generated method stub
		if (arg1.isEmpty()) {
			throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createInventoryServiceException();
		}

	}

	public void checkInventryRequest(InventoryRequest inventoryModel) throws InventoryServiceException {
	if(StringUtils.isEmpty(inventoryModel.getComments())) {
		throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createInventoryServiceException("comments");
	}
		
	}

}
