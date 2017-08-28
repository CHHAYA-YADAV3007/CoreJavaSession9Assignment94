/**
 * EmpNameComparator.java  1.1  28-Aug-2017
 * 
 */
//package declaration
package session94;

//Importing the java.util package to use Comparator Interface

import java.util.*;
/**
 * This class implements Comparator Interface and defines compare method for comparison.
 * 
 * Version 1.1
 * 
 * @author chhaya
 * 
 * Compiled on 28-Aug-2017
 *
 */
//public class declaration

public class EmpNameComparator implements Comparator{
	
//compare method definition for comparing two objects of Employee class
	
	public int compare(Object o1 , Object o2){
		
//Casting the parameters objects to Employee class objects		
		
		Employee e1=(Employee)o1 ;
		
		Employee e2=(Employee)o2;
		
//Compare Employee Salary First.Below method returns Integer value.
		
		int ret = Integer.compare(e1.getEmpSalary(), e2.getEmpSalary());
		
//If employee salary is equal for two employees 
//then compare Employee names	and sort them in ascending order	
		
		if(ret == 0){
		
		  ret = e1.getEmpName().compareTo(e2.getEmpName());
		  
//If employee names are equal,then compare Employee Designation 
//and sort them in ascending order.	  
		 
		    if (ret== 0){
		    	
		    	ret = e1.getEmpDesignation().compareTo(e2.getEmpDesignation());
		    	
		    	return ret ;
		    	
		    	}
		    
		    else
		    	
		    	return ret ;
		 
		 }
		
		else 
			return ret;
		
	}

}
