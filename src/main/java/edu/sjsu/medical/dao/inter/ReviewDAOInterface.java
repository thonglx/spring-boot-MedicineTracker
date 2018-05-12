package edu.sjsu.medical.dao.inter;

import java.util.List;

import edu.sjsu.medical.model.Review;

public interface ReviewDAOInterface {
	List<Review> getAllReviewsByProductName(String productName);
	String getAverageByProductName(String productName);
	void insertReview(Review reviewForm);
}
