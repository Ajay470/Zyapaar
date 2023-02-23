package com.zyapaar.Exception;

import java.time.LocalDateTime;

public class MyError {
	
	private LocalDateTime datetime;
	private String Message;
	private String Description;
	public MyError(LocalDateTime datetime, String message, String description) {
		super();
		this.datetime = datetime;
		Message = message;
		Description = description;
	}
	public MyError() {
		super();
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "MyError [datetime=" + datetime + ", Message=" + Message + ", Description=" + Description + "]";
	}
	
	

}
