package com.cts.product.entities;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "sales")
public class Sales {

	@Id
	private String id;
	private LocalDate saleDate;
	private String storeLocation;
	private boolean couponUsed;
	private String purchaseMethod;
	
	private List<Item> items;
	private Customer customer;
	
	
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public LocalDate getSaleDate() {
		return saleDate;
	}



	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}



	public String getStoreLocation() {
		return storeLocation;
	}



	public void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}



	public boolean isCouponUsed() {
		return couponUsed;
	}



	public void setCouponUsed(boolean couponUsed) {
		this.couponUsed = couponUsed;
	}



	public String getPurchaseMethod() {
		return purchaseMethod;
	}



	public void setPurchaseMethod(String purchaseMethod) {
		this.purchaseMethod = purchaseMethod;
	}



	public List<Item> getItems() {
		return items;
	}



	public void setItems(List<Item> items) {
		this.items = items;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public String toString() {
		return "Id: "+id+" Store Location: "+storeLocation;
	}
	
	
	
	
}
