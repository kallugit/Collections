package com.main.collections;

import java.util.ArrayList;
import java.util.List;

import models.EmployeeInfo;

public class ArrayEmp {

	public static void main(String[] args) {

    List<EmployeeInfo> Emp= new ArrayList<>();
    EmployeeInfo first=new EmployeeInfo();
    first.setEmpid(101);
    first.setEmpname("Ram");
    first.setEmpsalary(2000);
    first.setEmpcontact(122333);
    
    EmployeeInfo second=new EmployeeInfo();
    second.setEmpid(102);
    second.setEmpname("Dan");
    second.setEmpsalary(3000);
    second.setEmpcontact(229999);
    
    Emp.add(first);
    Emp.add(second);
    
    for(EmployeeInfo b:Emp)
    {
//    	System.out.println(b.getEmpid());
//    	System.out.println(b.getEmpname());
//    	System.out.println(b.getEmpcontact());
//    	System.out.println(b.getEmpsalary());
    	System.out.println(b);
    }
    
    
    
  
	}

}
