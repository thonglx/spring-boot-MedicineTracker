package edu.sjsu.medical.model;

public class Inventory {
	String productName;
	Integer amountOnHand;
	
	
	
	public Inventory(String productName, Integer amountOnHand) {
		super();
		this.productName = productName;
		this.amountOnHand = amountOnHand;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getAmountOnHand() {
		return amountOnHand;
	}
	public void setAmountOnHand(Integer amountOnHand) {
		this.amountOnHand = amountOnHand;
	}
	@Override
	public String toString() {
		return "Inventory [productName=" + productName + ", amountOnHand=" + amountOnHand + "]";
	}
	
	

}
