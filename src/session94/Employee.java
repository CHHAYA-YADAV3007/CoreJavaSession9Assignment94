/**
 * Employee.java 1.1 28-Aug-2017
 */
//package declaration
package session94;
/**
 * This class illustrates Employee class which identifies an employee with attributes of
 * Name , Designation and Salary.
 * 
 * version 1.1
 * 
 * @author Chhaya Yadav
 * 
 * Compiled on 28-Aug-2017
 *
 */
//public class declaration
public class Employee {

//member variable declaration
	
	private String empName ;
	
	private String empDesignation ;
	
	private int empSalary ;
	
//parameterized constructor declaration	
	
	public Employee(String empName , String empDesignation, int empSalary) {
		
		this.empName = empName ;
		
		this.empDesignation = empDesignation ;
		
		this.empSalary = empSalary ;
	}

//get method to retrieve Employee name
	
	public String getEmpName() {
		
		return empName;
	}

//set method to set the value of Employee name
	
	public void setEmpName(String empName) {
		
		this.empName = empName;
	}
//get method to retrieve Employee designation
	
	public String getEmpDesignation() {
		
		return empDesignation;
	}

//set method to set the value of Employee Designation
	
	public void setEmpDesignation(String empDesignation) {
		
		this.empDesignation = empDesignation;
	}
	
//get method to retrieve Employee Salary
	
	public int getEmpSalary() {
		
		return empSalary;
	}
//set method to set the value of Employee Salary
	
	public void setEmpSalary(int empSalary) {
		
		this.empSalary = empSalary;
	}
	

		
}