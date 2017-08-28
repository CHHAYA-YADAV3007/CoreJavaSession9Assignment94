/**
 * TreeSetDemo.java  1.1 28-Aug-2017
 */
//package declaration
package session94;

//importing the java.util package to implement TreeSet class & Comparator Interface of Collection Framework.

import java.util.* ;
/**
 * This class illustrate the TreeSet which contains unique elements in Set.
 * TreeSet implements Set Interface and maintains ascending order.
 * 
 * This class displays the Treeset which shows Employees in ascending order of their Salaries.
 * If Salaries are equal , it sorts the Employee names in ascending order.
 * If Employee Names are equal , it sorts the Employee Designation in ascending order.
 * 
 * Version 1.1
 * 
 * @author chhaya
 * 
 * Compiled on 28-Aug-2017
 *
 */
//public class declaration

public class TreeSetDemo {

//Main method declaration
	
	public static void main(String[] args) {
	
//Custom-Defined Comparator declaration and instantiation
		
        EmpNameComparator en = new EmpNameComparator();
        
//TreeSet Class declaration and instantiation with the help of Customer-Defined Comparator
	
		Set<Employee> ts = new TreeSet<Employee>(en);
		
//Employee class instantiation and initialization with the help of parameterized constructor		
		
		Employee emp1 = new Employee("CHHAYA","Project Manager",70000);
		
		Employee emp2 = new Employee("VARSHA","Technology Lead",65000);
		
		Employee emp3 = new Employee("CHHAYA","Consultant",70000);
		
		Employee emp4 = new Employee("VARSHA","Technology Analyst",65000);
		
		Employee emp5 = new Employee("RITU","Senior Software Enginner",50000);
		
		Employee emp6 = new Employee("VARSHA","Technology Architect",65000);
		
		Employee emp7 = new Employee("RASHI","Software Enginner",50000);
		
//Populating the TreeSet with Employee class instances		
		
		ts.add(emp1);
		
		ts.add(emp2);
		
		ts.add(emp3);
		
		ts.add(emp4);
		
        ts.add(emp5);
        
        ts.add(emp6);
        
        ts.add(emp7);
		
//Traversing through the TreeSet ,if it is non-empty
		
		if(!ts.isEmpty()){
			
			System.out.println("Display the Employee details in ascending order of their salaries,employee name and employee designation :");
			System.out.println("____________________________________________________________________");
			
//Traversing through non-empty TreeSet with the help of for loop
			
			for(Employee e: ts){
				
				System.out.println("Employee Name :" + e.getEmpName());
				System.out.println("Employee Designation :" + e.getEmpDesignation());
				System.out.println("Employee Salary :" + e.getEmpSalary());
				System.out.println("______________________________________________");
				
			}
		}
		
//Display appropriate message if TreeSet is empty.		
		else {
			
			System.out.println("Treeset is empty , what's the point in traversing through it.");
		}
		

	}

}
