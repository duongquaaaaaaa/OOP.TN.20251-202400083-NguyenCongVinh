package com.hust.kstn.models;

public class Media {
	private int id;
	 private String title;
	 private double cost;
	 private String category;
	 private static int nbMedias = 0;
	 
	 public Media(String title, double cost, String category) {
		 this.id = nbMedias++;
		 this.title = title;
		 this.cost = cost;
		 this.category = category;
		 }
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
		
	 public String toString() {
		 return "Media" + "[" + this.id + "]"
		 + "[" + this.title + "]"
		 + "[" + this.cost + "]"
		 + "[" + this.category + "]";
		}

}
