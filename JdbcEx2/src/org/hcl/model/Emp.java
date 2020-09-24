package org.hcl.model;

import java.io.Serializable;

public class Emp implements Serializable {
	private int eno;
	private String name;
	private String address;
	public Emp() {
		
	}
	public Emp(int eno, String name, String address) {
		super();
		this.eno = eno;
		this.name = name;
		this.address = address;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return String.format("%d\t%s\t%s", eno,name,address);
	}
	
}
