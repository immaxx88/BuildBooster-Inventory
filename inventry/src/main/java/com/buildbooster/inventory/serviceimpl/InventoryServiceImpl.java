package com.buildbooster.inventory.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.buildbooster.inventory.exception.ErrorCodes;
import com.buildbooster.inventory.exception.InventoryServiceException;
import com.buildbooster.inventory.model.InventoryModel;
import com.buildbooster.inventory.repository.InventoryRepository;
import com.buildbooster.inventory.response.InventoryResponse;
import com.buildbooster.inventory.service.InventoryService;
import com.buildbooster.inventory.transformer.ResponseTransformer;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	InventoryRepository inventoryRepository;

	@Autowired
	ResponseTransformer responseTransformer;

	@Override
	public List<InventoryResponse> getAllInventory() throws InventoryServiceException {
		// final InventoryModel entity = new InventoryModel(null, null, null, null,
		// null, null, null, null, null, null, null, null, null, null);
		// TODO
		
		List<InventoryModel> inventory = new ArrayList<>();
		List<InventoryResponse> response = new ArrayList<>();
		try {
		inventory = inventoryRepository.findAll();
		} catch (Exception ex) {
			throw ErrorCodes.ERROR_WHILE_FETCHING.createInventoryServiceException(ex.getMessage());
		}
		for (InventoryModel inventoryModel : inventory) {
		
			response.add(responseTransformer.convertToResponse(inventoryModel));
		}
		
		return response;
		// inventoryRepository.find(entity);
		// return null;
	}

	//@Transactional	
	public InventoryResponse saveInventory(InventoryModel inventoryModel) throws InventoryServiceException {
		try {
			//InventoryModel saveInventry = 
			//System.out.println("In IMPL");
			InventoryModel savedResponse = inventoryRepository.save(inventoryModel);
			return responseTransformer.convertToResponse(savedResponse);
		} catch (Exception ex) {
			//System.out.println("In IMPL");
			throw ErrorCodes.FAILD_TO_SAVE.createInventoryServiceException(ex.getMessage());
		}

	}
	public List<InventoryResponse> getCompanyInventory(Long companyid) 
			//throws InventoryServiceException 
	{
		
			List<InventoryModel> inventoryList = new ArrayList<>();
			List<InventoryResponse> responseInventoryList = new ArrayList<>();
			inventoryList = inventoryRepository.getCompanyInventory(companyid);
			for (InventoryModel inventoryModel : inventoryList) {
				responseInventoryList.add(responseTransformer.convertToResponse(inventoryModel));
			}
			return responseInventoryList;
			//try {
				//inventory = ;
			//	} catch (Exception ex) {
			//		throw ErrorCodes.ERROR_WHILE_FETCHING.createInventoryServiceException(ex.getMessage());
			//	}
	}
	
	public List<InventoryResponse> getFacilityInventory(Long companyid,Long facilityid)
	{
		List<InventoryModel> inventoryList = new ArrayList<>();
		List<InventoryResponse> responseInventoryList = new ArrayList<>();
		
		inventoryList = inventoryRepository.getFacilityInventory(companyid,facilityid);
		for (InventoryModel inventoryModel : inventoryList) {
			responseInventoryList.add(responseTransformer.convertToResponse(inventoryModel));
		}
		return responseInventoryList;
		
	}
	
	public InventoryResponse getFacilityItem(Long companyid, Long facilityid, Long inventoryitemid)
	{
		InventoryModel inventoryModel;
		InventoryResponse inventoryResponse;
		
		inventoryModel = inventoryRepository.getFacilityItem(companyid, facilityid, inventoryitemid);
		inventoryResponse = responseTransformer.convertToResponse(inventoryModel);
		
		return inventoryResponse;
		
	}
}
