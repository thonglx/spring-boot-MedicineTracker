package edu.sjsu.medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sjsu.medical.dao.ProductDAO;
import edu.sjsu.medical.model.Product;
import edu.sjsu.medical.service.inter.ProductServiceInterface;

@Service
public class ProductService implements ProductServiceInterface{
	
	@Autowired
	private ProductDAO productDAO;


	@Override
	public List<Product> getAllProducts() {
		return productDAO.getAllProductInfo();
	}
	

}
