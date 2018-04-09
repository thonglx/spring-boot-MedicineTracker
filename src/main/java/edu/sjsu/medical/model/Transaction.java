package edu.sjsu.medical.model;

import java.sql.Date;

public class Transaction {
	Integer transactionId;
	String issuer;
	String buyer;
	String seller;
	Date date;
	String item;
	Integer Amount;
	
	public Transaction(Integer transactionId, String issuer, String buyer, String seller, Date date, String item,
			Integer amount) {
		super();
		this.transactionId = transactionId;
		this.issuer = issuer;
		this.buyer = buyer;
		this.seller = seller;
		this.date = date;
		this.item = item;
		Amount = amount;
	}
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Integer getAmount() {
		return Amount;
	}
	public void setAmount(Integer amount) {
		Amount = amount;
	}
	@Override
	public String toString() {
		return "Transaction [TransactionId=" + transactionId + ", issuer=" + issuer + ", buyer=" + buyer + ", seller="
				+ seller + ", date=" + date + ", item=" + item + ", Amount=" + Amount + "]";
	}
	
	
	

}
