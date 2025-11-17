package com.hust.kstn.models;
import java.util.*;
public class Book {
	private String title;
	private String category;
	private double cost;
	private static int nbBook=0;
	private int id;
	private List<BookAuthor> authors = new ArrayList<>();
	private int numOfTokens;
	
	public String getTitle() {
		return title;
	}
	
	public String getCategory() {
		return category;
	}
	
	public double getCost() {
		return cost;
		
	}
	public int getId() {
		return id;
	}
	
	public int getNumOfTokens()
	{
	return numOfTokens;
	}
	
	public List<BookAuthor> getAuthors() {
	    return new ArrayList<BookAuthor>(authors); 
	}
	
	public Book(String title, String category, double cost, int numOfTokens, List<BookAuthor> authors)
	{
		this.title=title;
		this.category=category;
		this.cost=cost;
		this.numOfTokens=numOfTokens;
		this.authors=new ArrayList<BookAuthor>(authors);
		this.id=++nbBook;
	}
	
	public String toString() {
		 return "Book[" + this.id + "]["
		 + this.title + "]["
		 + this.cost + "]["
		 + this.category + "]["
		 + this.numOfTokens + "]"
		 + "\nAuthors: " + this.authors;
		}
}
