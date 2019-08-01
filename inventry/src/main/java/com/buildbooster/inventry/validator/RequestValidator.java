package com.buildbooster.inventry.validator;

import org.springframework.stereotype.Component;

import com.buildbooster.inventry.exception.ErrorCodes;
import com.buildbooster.inventry.exception.InventryServiceException;

@Component
public class RequestValidator {

	public void checkInventryRequest(String arg1) throws InventryServiceException {
		// TODO Auto-generated method stub
		if (arg1.isEmpty()) {
			throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createCatalogServiceException(arg1);
		}

	}

}
