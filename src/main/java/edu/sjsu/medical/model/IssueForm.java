package edu.sjsu.medical.model;

public class IssueForm {
	Integer nodeId;
	Integer productId;
	Integer amount;
	public Integer getNodeId() {
		return nodeId;
	}
	public void setNodeId(Integer nodeId) {
		this.nodeId = nodeId;
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
		return "IssueForm [nodeId=" + nodeId + ", productId=" + productId + ", amount=" + amount + "]";
	}
	
	

}
