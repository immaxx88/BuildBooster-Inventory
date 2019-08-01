package com.buildbooster.inventry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "catalog")
@EntityListeners(AuditingEntityListener.class)
public class InventryModel {

//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "id", length = 255)
//	private int id;

	@Id
	@Column(name = "supplier_id", length = 255)
	@NotNull
	private Double supplierId;

	@Column(name = "msku", length = 255)
	@NotNull
	private String msku;

	@Column(name = "sku", length = 255)
	@NotNull
	private String sku;

	@Column(name = "item_name", length = 255)
	@NotNull
	private String itemName;

	@Column(name = "item_desc", length = 2000)
	@NotNull
	private String itemDesc;

	@Column(name = "uom", length = 32)
	@NotNull
	private String uom;

	@Column(name = "unit_price", length = 32)
	@NotNull
	private double unitPrice;

	@Column(name = "lead_time", length = 40)
	@NotNull
	private double leadTime;

	@Column(name = "mfr_name", length = 255)
	@NotNull
	private String mfrName;

	@Column(name = "market_price", length = 32)
	private double marketPrice;

	@Column(name = "available_qty", length = 255)
	@NotNull
	private double availableQty;

	@Column(name = "supplier_url", length = 255)
	private String supplierUrl;

	@Column(name = "unit_of_issue", length = 3)
	private String unitOfIssue;

	@Column(name = "conv_from_qty", length = 5)
	private double convFromQty;

	@Column(name = "conv_to_qty", length = 5)
	private double convToQty;

	@Column(name = "conv_from_uom", length = 3)
	private String convFromUom;

	@Column(name = "image", length = 255)
	private String image;

	@Column(name = "tax_code", length = 2)
	@NotNull
	private Boolean taxCode;

	public Double getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Double supplierId2) {
		supplierId = supplierId2;
	}

	public String getMsku() {
		return msku;
	}

	public void setMsku(String msku) {
		this.msku = msku;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getLeadTime() {
		return leadTime;
	}

	public void setLeadTime(double leadTime) {
		this.leadTime = leadTime;
	}

	public String getMfrName() {
		return mfrName;
	}

	public void setMfrName(String mfrName) {
		this.mfrName = mfrName;
	}

	public double getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}

	public double getAvailableQty() {
		return availableQty;
	}

	public void setAvailableQty(double availableQty) {
		this.availableQty = availableQty;
	}

	public String getSupplierUrl() {
		return supplierUrl;
	}

	public void setSupplierUrl(String supplierUrl) {
		this.supplierUrl = supplierUrl;
	}

	public String getUnitOfIssue() {
		return unitOfIssue;
	}

	public void setUnitOfIssue(String unitOfIssue) {
		this.unitOfIssue = unitOfIssue;
	}

	public double getConvFromQty() {
		return convFromQty;
	}

	public void setConvFromQty(double convFromQty) {
		this.convFromQty = convFromQty;
	}

	public double getConvToQty() {
		return convToQty;
	}

	public void setConvToQty(double convToQty) {
		this.convToQty = convToQty;
	}

	public String getConvFromUom() {
		return convFromUom;
	}

	public void setConvFromUom(String convFromUom) {
		this.convFromUom = convFromUom;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Boolean getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(Boolean taxCode) {
		this.taxCode = taxCode;
	}

}
