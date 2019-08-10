package com.buildbooster.inventory.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "inventory_item")
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
public class InventoryModel {

//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "id", length = 255)
//	private int id;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "inventoryItemId")
	@NotNull
	private Long inventoryItemId;

	@Column(name = "productId")
	@NotNull
	private Long productId;

	@Column(name = "inventoryItemTypeId")
	@NotNull
	private Long inventoryItemTypeId;

	@Column(name = "companyId")
	@NotNull
	private Long companyId;

	@Column(name = "cUserId")
	@NotNull
	private Long cUserId;

	@Column(name = "datetimeReceived")
	private Date datetimeReceived;

	@Column(name = "facilityId")
	@NotNull
	private Long facilityId;

	@Column(name = "lotId")
	@NotNull
	private Long lotId;

	@Column(name = "uomId")
	@NotNull
	private Long uomId;

	@Column(name = "comments")
	private String comments;

	@Column(name = "quantityOnHandTotal")
	@NotNull
	private Integer quantityOnHandTotal;

	@Column(name = "unitCost")
	@NotNull
	private Float unitCost;

	@Column(name = "createdDate")
	private Date createdDate;

	@Column(name = "thresholdQuantityValue")
	@NotNull
	private Integer thresholdQuantityValue;

	public InventoryModel(@NotNull Long inventoryItemId, @NotNull Long productId, @NotNull Long inventoryItemTypeId,
			@NotNull Long companyId, @NotNull Long cUserId, Date datetimeReceived, @NotNull Long facilityId,
			@NotNull Long lotId, @NotNull Long uomId, String comments, @NotNull Integer quantityOnHandTotal,
			@NotNull Float unitCost, Date createdDate, @NotNull Integer thresholdQuantityValue) {
		super();
		this.inventoryItemId = inventoryItemId;
		this.productId = productId;
		this.inventoryItemTypeId = inventoryItemTypeId;
		this.companyId = companyId;
		this.cUserId = cUserId;
		this.datetimeReceived = datetimeReceived;
		this.facilityId = facilityId;
		this.lotId = lotId;
		this.uomId = uomId;
		this.comments = comments;
		this.quantityOnHandTotal = quantityOnHandTotal;
		this.unitCost = unitCost;
		this.createdDate = createdDate;
		this.thresholdQuantityValue = thresholdQuantityValue;
	}

	

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
