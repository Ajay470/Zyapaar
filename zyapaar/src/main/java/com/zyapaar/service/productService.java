package com.zyapaar.service;

import java.util.List;

import com.zyapaar.Exception.productException;
import com.zyapaar.model.Product;

public interface productService {
	
	public Product RegisterItem (Product p1)throws productException;
	
	public List<Product> getAllProducts ()throws productException;
	
	public Product removeProduct (Product p1)throws productException;
	
	public Product getStock (Integer productid)throws productException;
	
	public Product UpdateStatus (Product p1)throws productException;
	
	

}
