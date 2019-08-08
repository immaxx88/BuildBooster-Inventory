package com.buildbooster.inventory.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.buildbooster.inventory.exception.InventoryServiceException;
import com.buildbooster.inventory.model.InventoryModel;
import com.buildbooster.inventory.request.InventoryRequest;
import com.buildbooster.inventory.response.InventoryResponse;
import com.buildbooster.inventory.service.InventoryService;
import com.buildbooster.inventory.transformer.RequestTransformer;
import com.buildbooster.inventory.validator.RequestValidator;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/inventory")
public class InventoryController {

	@Autowired
	InventoryService inventoryService;

	@Autowired
	RequestValidator requestValidator;
	
	@Autowired
	RequestTransformer requestTransformer;
	
	@Autowired
	InventoryResponse inventoryResponse;

	@RequestMapping(value = "/getallrecords", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(value = "Method for getting all records from inventry")
	public List<InventoryResponse> getAllFromDB() throws InventoryServiceException {
		// TODO code for validator
		//InventoryResponse inventoryResponse = new InventoryResponse();
		
		requestValidator.checkInventryRequest("parameter");
		// TODO Service call
		return inventoryService.getAllInventory();
		//return null;
		//return List<InventoryResponse>;
		}
	
	@RequestMapping(value = "/createinventory", method = RequestMethod.POST, produces = "application/json" )
	@ApiOperation(value = "Method for creating a Inventory")
	public InventoryResponse createInventory(@RequestBody InventoryRequest inventoryRequest) throws InventoryServiceException {
		//System.out.println("In Create Inventory");
		requestValidator.checkInventryRequest(inventoryRequest);
		InventoryModel transformInventryRequest = requestTransformer.transformInventryRequest(inventoryRequest);

		return  inventoryService.saveInventory(transformInventryRequest);
		//return ResponseEntity<InventoryResponse> ;
	}
	
}
