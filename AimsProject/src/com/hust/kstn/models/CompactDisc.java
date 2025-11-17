package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {
	private String title;
	private String category;
	private double cost;
	private static int nbCompactDisc=0;
	private int id;
	private List<Track> tracks = new ArrayList<>();
	
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
	
	
	public List<Track> getTracks() {
	    return new ArrayList<Track>(tracks); 
	}
	
	public CompactDisc(String title, String category, double cost , List<Track> tracks)
	{
		this.title=title;
		this.category=category;
		this.cost=cost;
		this.tracks=new ArrayList<Track>(tracks);
		this.id=++nbCompactDisc;
	}
	
	public void addTrack(Track track) {
        tracks.add(track);
    }
    
    public void removeTrack(Track track) {
        tracks.remove(track);
    }
	
	public int totalLength()
	{
	int sum=0;
	for(Track v:tracks)
	{
		sum+=v.getLength();
	}
	return sum;
	}
	
	public String toString() {
		 return "CompactDisc[" + this.id + "]["
		 + this.title + "]["
		 + this.cost + "]["
		 + this.category + "]"
		 + "\nTracks: " + this.tracks;
		}

}
