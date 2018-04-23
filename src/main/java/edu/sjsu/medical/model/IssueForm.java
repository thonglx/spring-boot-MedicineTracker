package edu.sjsu.medical.model;

public class IssueForm {
	Integer nodeId;
	Integer productId;
	Integer newAmount;
	
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
	public Integer getNewAmount() {
		return newAmount;
	}
	public void setNewAmount(Integer newAmount) {
		this.newAmount = newAmount;
	}
	
	@Override
	public String toString() {
		return "IssueForm [nodeId=" + nodeId + ", productId=" + productId + ", newAmount=" + newAmount + "]";
	}

	

}
