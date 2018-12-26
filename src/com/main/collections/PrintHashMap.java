package com.main.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import models.Book;

public class PrintHashMap {

	public static void main(String[] args) {
		 HashMap<Integer,String> nameStudent= new HashMap<>();
		 
		 nameStudent.put(1,"Arun" );
		 nameStudent.put(2, "Kalpana");
		 nameStudent.put(3, "Kelvish");
		 
		 System.out.println("Name of Student :" + nameStudent);
		 nameStudent.remove(2);
	  	 
	  	 System.out.println("new List :" + nameStudent);
	  	 System.out.println("Is Empty :" +  nameStudent.isEmpty());
	  	 nameStudent.replace(3,"Kalpana");
	  	 nameStudent.put(4,"");
	  	System.out.println("n List :" + nameStudent);
	  	
	  	for(Map.Entry nameinfo: nameStudent.entrySet()) {
	  		System.out.println("Key = " + nameinfo.getKey() + "value =" + nameinfo.getValue() );
	  	}
	  	
	  	Book book1 = new Book();
	  	book1.setBookname("C");
	  	book1.setBookid(101);
	  	book1.setPrice(1000);
	  	
	  	Book book2= new Book();
	  	book2.setBookname("paris");
	  	book2.setBookid(102);
	  	book2.setPrice(2000);
	  	
	  	HashMap<String,Book> personBook=new HashMap<>();
	  	
	  	personBook.put("Arun", book2);
	  	personBook.put("Kelv", book1);
	  	
	  	for(Map.Entry coll:personBook.entrySet())
	  	{
	  		Book book =  (Book) coll.getValue();
	  		System.out.println("Name =" +coll.getKey() + book.toString());
	  	}
	  	
	  	
	  	HashMap<String, List<Book>> arunBook= new HashMap<>();
	  	ArrayList<Book> list=new ArrayList<Book>();
	    list.add(book2);
	    list.add(book1);
	  	
	    arunBook.put("Arun", list);
	  	
	    for(Map.Entry<String,List<Book>> print : arunBook.entrySet())
	    {
	  	
	  	System.out.println("List of Book:"  + print.getKey());
	  	Iterator itr=print.getValue().iterator();
	  	while(itr.hasNext()) {
	  		System.out.println(itr.next().toString());
	  	}
	    }
	  	
	}

}
