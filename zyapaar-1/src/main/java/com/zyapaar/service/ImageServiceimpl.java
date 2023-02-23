package com.zyapaar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyapaar.Exception.ImageException;
import com.zyapaar.model.Image;
import com.zyapaar.repo.ImageRepo;


@Service
public class ImageServiceimpl implements ImageService{
	
	@Autowired
	private ImageRepo iRepo;

	@Override
	public Image registerImage(Image img) throws ImageException {
		if(img !=null) {
			Image img1=iRepo.save(img);
			return img1;
			
		}else {
			throw new ImageException("Image is null");
		}
	}

	@Override
	public Image getImage(Integer id) throws ImageException {
		// TODO Auto-generated method stub
      Optional<Image> product1= iRepo.findById(id);
		
		if(product1.isPresent()) {
			Image p=product1.get();
			
			return p;
		}else {
			throw new ImageException("Product not Exist");
		}
		
		
	
	}

}
