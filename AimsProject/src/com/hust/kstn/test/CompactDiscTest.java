package com.hust.kstn.test;

import com.hust.kstn.models.*;
import java.util.*;

public class CompactDiscTest {

    public static void main(String[] args) {
    	
        Track t1 = new Track("Shape of You", 233);
        Track t2 = new Track("Bohemian Rhapsody", 354);
        Track t3 = new Track("Blinding Lights", 200);
        Track t4 = new Track("Rolling in the Deep", 228);
        Track t6_duplicate = new Track("Shape of You", 233); 
        Track t7_notInList = new Track("Despacito", 229);
        
        List<Track> initialTracks = new ArrayList<>();
        initialTracks.add(t1);
        initialTracks.add(t2);

        CompactDisc cd = new CompactDisc("Best of 2020s", "Pop/Rock", 20.00, initialTracks); 
        
        cd.addTrack(t1);
        cd.addTrack(t2);
        cd.addTrack(t3);
        cd.addTrack(t4);
        
        cd.addTrack(t6_duplicate); 
        
        System.out.println(cd.toString());


        cd.removeTrack(t2);
        
        cd.removeTrack(t7_notInList);

        System.out.println(cd.toString());
        
    }
}