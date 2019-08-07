package com.buildbooster.inventory.response;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
public class InventoryResponse {

	private Long inventoryItemId;

	private Long productId;

	private Long inventoryItemTypeId;

	private Long companyId;

	private Long cUserId;

	private Date datetimeReceived;

	private Long facilityId;

	private Long lotId;

	private Long uomId;

	private String comments;

	private Integer quantityOnHandTotal;

	private Float unitCost;

	private Date createdDate;

	private Integer thresholdQuantityValue;

	public Long getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getInventoryItemTypeId() {
		return inventoryItemTypeId;
	}

	public void setInventoryItemTypeId(Long inventoryItemTypeId) {
		this.inventoryItemTypeId = inventoryItemTypeId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getcUserId() {
		return cUserId;
	}

	public void setcUserId(Long cUserId) {
		this.cUserId = cUserId;
	}

	public Date getDatetimeReceived() {
		return datetimeReceived;
	}

	public void setDatetimeReceived(Date datetimeReceived) {
		this.datetimeReceived = datetimeReceived;
	}

	public Long getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(Long facilityId) {
		this.facilityId = facilityId;
	}

	public Long getLotId() {
		return lotId;
	}

	public void setLotId(Long lotId) {
		this.lotId = lotId;
	}

	public Long getUomId() {
		return uomId;
	}

	public void setUomId(Long uomId) {
		this.uomId = uomId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getQuantityOnHandTotal() {
		return quantityOnHandTotal;
	}

	public void setQuantityOnHandTotal(Integer quantityOnHandTotal) {
		this.quantityOnHandTotal = quantityOnHandTotal;
	}

	public Float getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(Float unitCost) {
		this.unitCost = unitCost;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getThresholdQuantityValue() {
		return thresholdQuantityValue;
	}

	public void setThresholdQuantityValue(Integer thresholdQuantityValue) {
		this.thresholdQuantityValue = thresholdQuantityValue;
	}
		

}
