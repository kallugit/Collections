package com.main.collections;

import java.util.HashMap;
import java.util.Map;

import models.EmployeeInfo;

public class HashMapEmp {

	public static void main(String[] args) {
		
            EmployeeInfo emp=new EmployeeInfo();
            emp.setEmpid(1);
            emp.setEmpname("Ramu");
            emp.setEmpsalary(1000);
            emp.setEmpcontact(12223);
            
            EmployeeInfo emp1=new EmployeeInfo();
            emp1.setEmpid(102);
            emp1.setEmpname("gita");
            emp1.setEmpsalary(2344);
            emp1.setEmpcontact(344556);
            
            HashMap<String,EmployeeInfo> EmployeDetail= new HashMap();
            
            EmployeDetail.put("Ramu", emp);
            EmployeDetail.put("gita",emp1);
            
            for(Map.Entry detail:EmployeDetail.entrySet())
            {
            	EmployeeInfo d=(EmployeeInfo) detail.getValue();
            	System.out.println("Name =" + detail.getKey() +d.toString());
            }
            }
            
            
            
            
		
	}


