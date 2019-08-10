package com.buildbooster.inventory.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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

/******************************************************************************************************************/
	@RequestMapping(value = "/getallinventory", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(value = "API for getting all records from inventry")
	public List<InventoryResponse> getAllFromDB() throws InventoryServiceException 
	{
		requestValidator.checkInventryRequest("parameter");
		return inventoryService.getAllInventory();
	}
	
 /******************************************************************************************************************/
	@RequestMapping(value = "/createinventory", method = RequestMethod.POST, produces = "application/json" )
	@ApiOperation(value = "API for creating a Inventory")
	public InventoryResponse createInventory(@RequestBody InventoryRequest inventoryRequest) throws InventoryServiceException 
	{
		requestValidator.checkInventryRequest(inventoryRequest);
		InventoryModel transformInventryRequest = requestTransformer.transformInventryRequest(inventoryRequest);
		return  inventoryService.saveInventory(transformInventryRequest);

	}
	
/*****************************************************************************************************************/
	
	@RequestMapping(value = "/getallinventory/{companyId}", method = RequestMethod.GET, produces= "application/json")
	@ApiOperation(value = "API for fetching inventory against a company for all facilities")
	public List<InventoryResponse> fetchCompanyInventory(@PathVariable(value = "companyId") Long companyid) throws InventoryServiceException 
	{
		requestValidator.checkCompanyID(companyid);
		return inventoryService.getCompanyInventory(companyid);
	}
	
/******************************************************************************************************************/
	@RequestMapping(value = "/getallinventory/{companyId}/{facilityId}", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(value="API for fetching inventory against a specific facility of a company")
	public List<InventoryResponse> fetchFacilityInventory(@PathVariable(value = "companyId") Long companyid , @PathVariable (value = "facilityId") Long facilityid)
	{
		return inventoryService.getFacilityInventory(companyid,facilityid);
	}
	
/******************************************************************************************************************/
	
	@RequestMapping(value = "/getallinventory/{companyId}/{facilityId}/{inventoryItemId}", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(value="API for fetching inventory item against a specific facility of a company")
	public InventoryResponse fetchFacilityItemInventory(@PathVariable(value = "companyId") Long companyid , @PathVariable (value = "facilityId") Long facilityid,@PathVariable (value = "inventoryItemId") Long inventoryitemid)
	{
		return inventoryService.getFacilityItem(companyid,facilityid,inventoryitemid);
	}
	
/******************************************************************************************************************/
}
