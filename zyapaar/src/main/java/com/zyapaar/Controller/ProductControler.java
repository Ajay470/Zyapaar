package com.zyapaar.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zyapaar.Exception.productException;
import com.zyapaar.model.Product;
import com.zyapaar.service.productService;

@RestController
public class ProductControler {
	
	@Autowired
	private productService pser;
	
	
	
	@PostMapping("/Add")
    public ResponseEntity<Product> RegisterItemHandler (@RequestBody Product p1)throws productException{
		Product product1= pser.RegisterItem(p1);
		
		return new ResponseEntity<Product>(product1,HttpStatus.CREATED);
    	
    	
    }
	
	@GetMapping("GetAll")
	public ResponseEntity<List<Product>> getAllProductsHandler ()throws productException{
		List<Product> product1= pser.getAllProducts();
		
		return new ResponseEntity<List<Product>>(product1,HttpStatus.OK);
	}
	
	@DeleteMapping("/remove")
	public ResponseEntity<Product> removeProductHsndler (@RequestBody Product p1)throws productException{
         Product product1= pser.removeProduct(p1);
		
		return new ResponseEntity<Product>(product1,HttpStatus.OK);
	}
	@GetMapping("getStock/{id}")
	public ResponseEntity<Product> getStockHandler (@PathVariable("id") Integer productid)throws productException{
       Product product1= pser.getStock(productid);
		
		return new ResponseEntity<Product>(product1,HttpStatus.OK);
	}
	
	@PutMapping("/updatestock")
	public ResponseEntity<Product> UpdateStatusHandler (@RequestBody Product p1)throws productException{
        Product product1= pser.UpdateStatus(p1);
		
		return new ResponseEntity<Product>(product1,HttpStatus.OK);
		
	}

}
