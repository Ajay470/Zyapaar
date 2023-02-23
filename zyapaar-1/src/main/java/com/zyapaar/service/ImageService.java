package com.zyapaar.service;

import com.zyapaar.Exception.ImageException;
import com.zyapaar.model.Image;

public interface ImageService {
	
	public Image registerImage(Image img) throws ImageException;
	
	public Image getImage(Integer id) throws ImageException;

}
