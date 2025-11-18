package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
	
	private List<Track> tracks = new ArrayList<>();
	
	public List<Track> getTracks() {
	    return new ArrayList<Track>(tracks); 
	}
	
	public CompactDisc(String title, String category, double cost , List<Track> tracks)
	{
		super(title, cost, category);
		this.tracks=new ArrayList<Track>(tracks);
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
		 return super.toString()
		 + "\nTracks: " + this.tracks;
		}

}
