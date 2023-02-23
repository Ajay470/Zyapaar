package com.zyapaar.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.zyapaar.Exception.ImageException;
import com.zyapaar.model.Image;
import com.zyapaar.service.ImageService;

@ControllerAdvice
public class ImageController {
	
	@Autowired
	private ImageService Iser;
	
	@PostMapping("/AddImage")
    public ResponseEntity<Image> registerImageHandler(@RequestBody Image img) throws ImageException{
        Image img1= Iser.registerImage(img);
		
		return new ResponseEntity<Image>(img1,HttpStatus.CREATED);
	}
	
	@GetMapping("get/{id}")
	public ResponseEntity<Image> getImageHandler(@PathVariable("id") Integer id) throws ImageException{
        Image img1= Iser.getImage(id);
		
		return new ResponseEntity<Image>(img1,HttpStatus.OK);
	}
	
	

}
