package edu.sjsu.medical.model;

public class Product {
	Integer productID;
	String productName;
	String date;
	String ingredient;
	String notice;
	
	
	
	
	public Product() {

	}


	public Product(Integer productID, String productName, String date, String ingredient, String notice) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.date = date;
		this.ingredient = ingredient;
		this.notice = notice;
	}
	
	
	public Integer getProductID() {
		return productID;
	}
	public void setProductID(Integer productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getIngredient() {
		return ingredient;
	}
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	@Override
	public String toString() {
		return "Products [productID=" + productID + ", productName=" + productName + ", date=" + date + ", ingredient="
				+ ingredient + ", notice=" + notice + "]";
	}
	
	

}
