package com.hust.kstn.models;
import java.util.*;
public class Book extends Media {
	
	private List<BookAuthor> authors = new ArrayList<>();
	private int numOfTokens;
	
	public int getNumOfTokens()
	{
	return numOfTokens;
	}
	
	public List<BookAuthor> getAuthors() {
	    return new ArrayList<BookAuthor>(authors); 
	}
	
	public Book(String title, String category, double cost, int numOfTokens, List<BookAuthor> authors)
	{
		super(title, cost, category);
		this.numOfTokens=numOfTokens;
		this.authors=new ArrayList<BookAuthor>(authors);
	}
	
	public String toString() {
		 return super.toString()
		 +"["+ this.numOfTokens + "]"
		 + "\nAuthors: " + this.authors;
		}
}
