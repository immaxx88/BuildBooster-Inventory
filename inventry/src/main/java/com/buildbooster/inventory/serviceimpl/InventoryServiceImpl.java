package com.buildbooster.inventory.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	ResponseTransformer transformer;

	@Override
	public List<InventoryResponse> getAllInventory() {
		//final InventoryModel entity = new InventoryModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		// TODO
		
		List<InventoryModel> inventory = new ArrayList<>();
		List<InventoryResponse> response = new ArrayList<>();
		inventory = inventoryRepository.findAll();
		
		for (InventoryModel inventoryModel : inventory) {
			
			response.add(transformer.convertToResponse(inventoryModel));
		}
		return response;
		//inventoryRepository.find(entity);
		//		return null;
	}
	
	public InventoryResponse saveInventory(InventoryModel inventoryModel)
	{
		inventoryRepository.save(inventoryModel);
		//InventoryResponse response = new InventoryResponse();
		//transformer.convertToResponse(inventoryModel);
		return null;
	}
}
