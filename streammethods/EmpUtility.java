package com.slokam.utility;

import java.util.Arrays;
import java.util.List;

import com.slokam.pojo.Account;
import com.slokam.pojo.Employee;
import com.slokam.pojo.Mobiles;

public interface EmpUtility {
	
	static List<Employee> getEmpInfo(){
		List<Mobiles> mobilList  = Arrays.asList(new Mobiles(1234567, "Idea"),new Mobiles(1234568, "Airtel"),new Mobiles(1234569, "Jio"));
		List<Employee> EmployeeList  = Arrays.asList(new Employee(3, "empCCC", "one@gmail.com", "male", "se", new Account(1111123456, "ICICI"), mobilList),
				new Employee(2, "empBBB", "two@gmail.com", "male", "IT", new Account(2222123456L, "SBI"), mobilList),
				new Employee(1, "empAAA", "three@gmail.com", "male", "BA", new Account(3333123456L, "AXIS"), Arrays.asList(new Mobiles(1234567, "Idea"),new Mobiles(1234568, "Airtel"),new Mobiles(1234569, "Jio"))));
		return EmployeeList;
		
	}

}
