package com.zyapaar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Image {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer imageid;
	private String Url;
	private String message ;
	public Image(Integer imageid, String url, String message) {
		super();
		this.imageid = imageid;
		Url = url;
		this.message = message;
	}
	public Integer getImageid() {
		return imageid;
	}
	public void setImageid(Integer imageid) {
		this.imageid = imageid;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Image() {
		super();
	}
	@Override
	public String toString() {
		return "Image [imageid=" + imageid + ", Url=" + Url + ", message=" + message + "]";
	}
	
	

}
