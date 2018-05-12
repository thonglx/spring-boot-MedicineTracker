package edu.sjsu.medical.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import edu.sjsu.medical.dao.inter.ReviewDAOInterface;
import edu.sjsu.medical.model.Review;
import edu.sjsu.medical.sql.SQL;




@Repository
public class ReviewDAO implements ReviewDAOInterface{
	
	@Autowired
	private JdbcTemplate jtm;

	@Override
	public List<Review> getAllReviewsByProductName(String productName) {
		String whereClause = "WHERE PRODUCT = '" + productName + "'";
	return jtm.query(SQL.GET_REVIEW + whereClause, new RowMapper<Review>(){  
				
				@Override  
				  public Review mapRow(ResultSet rs, int rownumber) throws SQLException {  
					Review review = 
			    		new Review(rs.getString("NAME"),
			    				rs.getString("FEEDBACK"), 
			    				rs.getInt("RATING"), 
			    				rs.getString("PRODUCT"), 
			    				rs.getString("IMAGE"));
				return review;                    
				}
				    });  
				}  
	@Override
	public void  insertReview(Review reviewForm) {
		jtm.update(SQL.INSERT_REVIEW, new Object[] {
				reviewForm.getFeedBack(), reviewForm.getRating(), 
				reviewForm.getFullName(), reviewForm.getProductName(), 
				reviewForm.getImageNum()
			});
	}
	@Override
	public String getAverageByProductName(String productName) {
		String averageRating = (String) jtm.queryForObject(
    		SQL.GET_AVERAGE, new Object[] { productName }, String.class);
    return averageRating;
}
	

}
