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
	if(StringUtils.isEmpty(inventoryModel.getComments())) 
			{
		throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createInventoryServiceException("Comments");
	}
	if(StringUtils.isEmpty(inventoryModel.getCompanyId()))  {
		throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createInventoryServiceException("CompanyID");
	}
	if(StringUtils.isEmpty(inventoryModel.getCreatedDate() )) {
		throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createInventoryServiceException("CreatedDate");
	}
	if(StringUtils.isEmpty(inventoryModel.getCUserId() )) {
		throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createInventoryServiceException("UserID");
	}
	if(StringUtils.isEmpty(inventoryModel.getDatetimeReceived())) {
		throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createInventoryServiceException("ReceivedDate");
	}
	if(StringUtils.isEmpty(inventoryModel.getFacilityId() )) {
		throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createInventoryServiceException("FacilityID");
	}
//	if(StringUtils.isEmpty(inventoryModel.getInventoryItemId() )) {
//		throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createInventoryServiceException("InventoryID");
//	}
	if(StringUtils.isEmpty(inventoryModel.getInventoryItemTypeId() )) {
		throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createInventoryServiceException("InventoryIDType");
	}
	if(StringUtils.isEmpty(inventoryModel.getLotId() )) {
		throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createInventoryServiceException("LotID");
	}
	if(StringUtils.isEmpty(inventoryModel.getProductId() )) {
		throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createInventoryServiceException("productID");
	}
	if(StringUtils.isEmpty(inventoryModel.getQuantityOnHandTotal())) {
		throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createInventoryServiceException("quantityInHand");
	}
	if(StringUtils.isEmpty(inventoryModel.getThresholdQuantityValue())) {
		throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createInventoryServiceException("thresholdQuantity");
	}
	if(StringUtils.isEmpty(inventoryModel.getUnitCost() )) {
		throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createInventoryServiceException("UnitCost");
	}
	if(StringUtils.isEmpty(inventoryModel.getUomId() )) {
		throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createInventoryServiceException("UomID");
	}
		
	}

	public void checkCompanyID(Long companyid)  throws InventoryServiceException {
		if (companyid == null ) {
			throw ErrorCodes.MANDATORY_ELEMENT_MISSING.createInventoryServiceException("CompanyID");
		}
		
		// TODO Auto-generated method stub
		
	}

}
