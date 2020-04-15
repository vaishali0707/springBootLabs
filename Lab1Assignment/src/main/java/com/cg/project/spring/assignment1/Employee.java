package com.cg.project.spring.assignment1;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private SBU businessUnit;
	private int age;
	
	public int getEmployeeId() {
		System.out.println("Employee Id:  "+employeeId);
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId; 
	}
	public String getEmployeeName() {
		System.out.println("Employee name:  "+employeeName);
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		System.out.println("Employee Salary:  "+salary);
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public SBU getBusinessUnit() {
		
		System.out.println("SBU Id: "+businessUnit.getSbuId()+", "+"SBU Name: "+businessUnit.getSbuName()+
				", "+"SBU Head: "+businessUnit.getSbuHead());
		return businessUnit;
	}
	@Autowired
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	
	public void data()
	{
		businessUnit.getEmpdata();
	}
	public int getAge() {
		System.out.println("Employee Age:  "+age);
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
