package com.buildbooster.inventory.validator;

import org.springframework.stereotype.Component;

import com.buildbooster.inventory.exception.ErrorCodes;
import com.buildbooster.inventory.exception.InventoryServiceException;

@Component
public class RequestValidator {

	public void checkInventryRequest(String arg1) throws InventoryServiceException {
		// TODO Auto-generated method stub
		if (arg1.isEmpty()) {
			throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createCatalogServiceException(arg1);
		}

	}

}
