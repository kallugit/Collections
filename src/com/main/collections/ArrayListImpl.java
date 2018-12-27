package com.main.collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import models.Book;

public class ArrayListImpl {

	public static void main(String []arg)
	{
		List<String> names = new ArrayList<>();
		System.out.println("Is Empty :" + names.isEmpty());
		names.add("Tejendra");
		names.add("Arun");
		names.add("Mamta");
		names.add("Drisana");
		names.add("Dhan");
		System.out.println("Names size =" + names.size());
		System.out.println("Name=" + names);
		boolean x = names.remove("Arun");
		System.out.println(x);
		System.out.println("Name=" +names);
		
		System.out.println("Using for each");
		for(String  name : names) {
			System.out.println(name);
		}
		
		System.out.println("Using Iterator each");
		Iterator itr = names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("first element :"  + names.get(0));
		System.out.println("Size :" + names.size());
		System.out.println("Last element :" + names.get(names.size()-1));
		names.remove(names.size()-1);
		
		System.out.println("Name=" + names);
		
		System.out.println("Is Mamta in the list? : "+ names.contains("Mamta"));
		System.out.println("Is Empty :" + names.isEmpty());

		
		//books
		
	      List<Book> books= new ArrayList<>();
	      Book book1= new Book();
	      book1.setBookid(101);
	      book1.setBookname("Alice wonderland");
	      book1.setPrice(2000);
	      
	      Book book2= new Book();
	      book2.setBookid(102);
	      book2.setBookname("programming in C");
	      book2.setPrice(3000);
	      
	      books.add(book1);
	      books.add(book2);
	      
	      for(Book z :books) {
		      System.out.println(z);
	      }
	}
}
