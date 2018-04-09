package edu.sjsu.medical.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import edu.sjsu.medical.dao.inter.ProductDAOInterface;
import edu.sjsu.medical.model.Product;
import edu.sjsu.medical.sql.SQLQueries;

@Repository
public class ProductDAO implements ProductDAOInterface {
	
	@Autowired
	private JdbcTemplate jtm;

	@Override
	public List<Product> getAllProductInfo() {
		return jtm.query(SQLQueries.ALL_PRODUCTS_INFO, new RowMapper<Product>(){  
			
	@Override  
	  public Product mapRow(ResultSet rs, int rownumber) throws SQLException {  
      Product product = new Product(rs.getInt("PRODUCT_ID"), 
			rs.getString("PRODUCT_NAME"), 
			rs.getString("EXPIRED_DATE"),
			rs.getString("INGREDIENT"),
			rs.getString("NOTICE")
			);
	return product;                    
	}
	    });  
	}  
}  