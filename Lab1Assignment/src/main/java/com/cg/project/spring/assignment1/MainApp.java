package com.cg.project.spring.assignment1;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class MainApp {
	
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      Employee obj = (Employee) context.getBean("employee");
	      System.out.println("Employee Details");
	      System.out.println("------------------------");
//	      obj.getEmployeeId();
//	      obj.getEmployeeName();
//	      obj.getSalary();
//	      
//	      obj.getAge();
	      obj.getBusinessUnit();
	      System.out.println("\n");
	      System.out.println("Employee Details");
	      System.out.println("------------------------");
	      obj.data();
	      System.out.println("\n");
	      
	     Scanner scanner=new Scanner(System.in);
	     System.out.println("Please enter id");
	     int id=scanner.nextInt();
	     if(id==obj.getEmployeeId())
	     {
	    	 System.out.println("---Employee Info---");
	    	 obj.getEmployeeId();
	    	 obj.getEmployeeName();
	    	 obj.getSalary();
	     }
	     scanner.close();
	}
	}
