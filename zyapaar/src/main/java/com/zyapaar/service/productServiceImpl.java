package com.zyapaar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyapaar.Exception.productException;
import com.zyapaar.Repo.productRepo;
import com.zyapaar.model.Product;

@Service
public class productServiceImpl implements productService{
	
	@Autowired
	private productRepo prepo;

	@Override
	public Product RegisterItem(Product p1) throws productException {
		
		if(p1 !=null) {
			Product product1=prepo.save(p1);
			return product1;
			
		}else {
			throw new productException("Product is Null");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getAllProducts() throws productException {
		
		List<Product> list=prepo.findAll();
		
		if(list.size()==0) {
			throw new productException("No Product");
		}else {
			return list;
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product removeProduct(Product p1) throws productException {
		Optional<Product> product1= prepo.findById(p1.getProductId());
		
		if(product1.isPresent()) {
			Product p=product1.get();
			prepo.delete(p);
			return p;
		}else {
			throw new productException("Product not Exist");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product getStock(Integer productid) throws productException {
		
		
Optional<Product> product1= prepo.findById(productid);
		
		if(product1.isPresent()) {
			Product p=product1.get();
			
			return p;
		}else {
			throw new productException("Product not Exist");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product UpdateStatus(Product p1) throws productException {
		
		
    Optional<Product> product1= prepo.findById(p1.getProductId());
		
		if(product1.isPresent()) {
			
			Product updatedproduct =prepo.save(p1);
			return updatedproduct;
		}else {
			throw new productException("Product not Exist");
		}
	}

}
