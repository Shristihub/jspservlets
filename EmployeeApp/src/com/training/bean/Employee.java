package com.training.bean;

public class Employee {
	String empname;
	int empId;
	Long mobile;
	Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empId=" + empId + ", mobile=" + mobile + ", address=" + address
				+ "]";
	}
	
	
	

}
