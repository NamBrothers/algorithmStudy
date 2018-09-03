package com.ch1.no1;

public class Data {
	
	private String name;
	private String phoneNo;
	
	public Data() {
	}
	
	public Data(String name, String phoneNo) {
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return "Data [name=" + name + ", phoneNo=" + phoneNo + "]";
	}
}
