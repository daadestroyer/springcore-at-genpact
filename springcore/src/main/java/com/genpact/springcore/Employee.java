package com.genpact.springcore;

public class Employee {
	private int eid;
	private String ename;
	private String eaddr;
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int eid, String ename, String eaddr) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddr = eaddr;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getEaddr() {
		return eaddr;
	}


	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddr=" + eaddr + "]";
	}
	
	
}
