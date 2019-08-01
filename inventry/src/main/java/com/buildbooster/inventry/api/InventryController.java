package com.buildbooster.inventry.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.buildbooster.inventry.exception.InventryServiceException;
import com.buildbooster.inventry.response.InventryResponse;
import com.buildbooster.inventry.service.IInventryService;
import com.buildbooster.inventry.validator.RequestValidator;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/inventry")
public class InventryController {

	@Autowired
	IInventryService catalogService;

	@Autowired
	RequestValidator requestValidator;

	@RequestMapping(value = "/getallrecords", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(value = "Method for getting all records from inventry")
	public ResponseEntity<InventryResponse> getAllFromDB() throws InventryServiceException {
		// TODO code for validator
		requestValidator.checkInventryRequest("parameter");
		// TODO Service call
		catalogService.saveExcel();
		return null;
	}
}
