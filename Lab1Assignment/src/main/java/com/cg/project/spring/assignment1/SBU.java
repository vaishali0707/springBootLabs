package com.cg.project.spring.assignment1;

import java.util.ArrayList;
import java.util.List;

public class SBU {
	
	private String sbuId;
	private String sbuName;
	private String sbuHead;
	private List<Employee>empList=new ArrayList<Employee>();
	
	public String getSbuId() {
		return sbuId;
	}
	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public void getEmpdata()
	{
		for(Employee emp:empList)
		{
			emp.getEmployeeId();
			emp.getEmployeeName();
			emp.getSalary();
			emp.getAge();
		}
	}

}
