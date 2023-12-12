package com.AirAsia.demo.model;

import java.util.Date;

public class ErrorResponse {

	private int statuscode;
	private String errormessage;
	private java.util.Date date;
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getErrormessage() {
		return errormessage;
	}
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public ErrorResponse(int statuscode, String errormessage, Date date) {
		super();
		this.statuscode = statuscode;
		this.errormessage = errormessage;
		this.date = date;
	}
	
	
	
}
