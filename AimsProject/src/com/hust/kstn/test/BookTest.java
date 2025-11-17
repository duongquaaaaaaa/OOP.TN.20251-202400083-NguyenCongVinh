package com.hust.kstn.test;

import java.util.*;

import com.hust.kstn.models.*;

public class BookTest {
	public static void main(String []args)
	{
		BookAuthor gs1= new BookAuthor("Christopher Nolan", 1980, "Professor");
		BookAuthor gs2= new BookAuthor("James Cameron", 1982, "Data Scientis");
		BookAuthor gs3= new BookAuthor("Peter Jackson", 1983, "Nobel Winner");
		BookAuthor gs4= new BookAuthor("Anthony Russo", 2000, "PhD in CS");
		BookAuthor gs5= new BookAuthor("George Lucas", 2006, "AI Researcher");
		
		List<BookAuthor> authors1=new ArrayList<>();
		authors1.add(gs1);
		authors1.add(gs2);
		authors1.add(gs5);
		Book book1 = new Book("Artificial Intelligence: A Modern Approach", "Science", 80.00, 1200, authors1);
		System.out.println(book1.toString());
		
		List<BookAuthor> authors2=new ArrayList<>();
		authors2.add(gs3);
		authors2.add(gs4);
		Book book2 = new Book("The Great Gatsby", "Romance", 15.00, 180, authors2);
		System.out.println(book2.toString());
	}
}
