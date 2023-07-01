import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class EmployeeSearcById {

	@Test
	public void searchById() throws SQLException 
	
	
	{
		EmployeeDAOImpl empdaoimpl = new EmployeeDAOImpl(); // Employee e1=new
		
		  Employee e1=new Employee();
		  e1.setEmployeeId(1);
		  List l=empdaoimpl.searchEmployee(e1);
		 
		  
		  String expected=l.toString();
		 

		  String result="[1, xxx, yyy, xxy, Senior Associate, Software Engineer]";
		  
		  
		  
		 
		assertEquals(expected,result);
		  
		
	
	
	}

	
	
	@Test
	public void searchByDesignation() throws SQLException 
	
	
	{

		  EmployeeDAOImpl empdaoimpl = new EmployeeDAOImpl();
		  
		  // Employee e1=new
		  
		  List l = empdaoimpl.searchEmployeeByDesignation("Senior Associate");
		
	String expected=l.toString();
	String result="[1, xxx, yyy, xxy, Senior Associate, 3, bcd, tys, yuo, Senior Associate]";
	assertEquals(expected,result);
	
	}

}
