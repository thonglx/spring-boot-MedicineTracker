package edu.sjsu.medical.model;

public class Review {
	String fullName;
	String feedBack;
	Integer rating;
	String productName;
	String imageNum;
	
	
	
	public Review() {
	}
	
	public Review(String fullName, String feedBack, Integer rating, String productName, String imageNum) {
		super();
		this.fullName = fullName;
		this.feedBack = feedBack;
		this.rating = rating;
		this.productName = productName;
		this.imageNum = imageNum;
	}
	public String getImageNum() {
		return imageNum;
	}
	public void setImageNum(String imageNum) {
		this.imageNum = imageNum;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getFeedBack() {
		return feedBack;
	}
	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Review [fullName=" + fullName + ", feedBack=" + feedBack + ", rating=" + rating + ", productName="
				+ productName + "]";
	}

}
