package edu.sjsu.medical.model;

public class NewTransaction {
	Integer sellerId;
	Integer buyerId;
	Integer productId;
	Integer amount;
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "NewTransaction [sellerId=" + sellerId + ", buyerId=" + buyerId + ", productId=" + productId
				+ ", amount=" + amount + "]";
	}
	
	

}
