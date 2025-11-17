package com.hust.kstn.test;

import com.hust.kstn.models.*;

public class StoreTest {
	public static void main(String[] args) {
        Store ss = new Store();

        DigitalVideoDisc notInCart1 = new DigitalVideoDisc("Unknown Director 1", "Mystery 1", "Ghost Disc 1 ", 90, 9.99);
        DigitalVideoDisc notInCart2 = new DigitalVideoDisc("Unknown Director 2", "Mystery 2", "Ghost Disc 2", 100, 10);
        ss.removeDVD(notInCart1);
        System.out.println();
        
        ss.addDVD(notInCart1);
        ss.removeDVD(notInCart2);
        System.out.println();
        
        ss.removeDVD(notInCart1);
        System.out.println();

        DigitalVideoDisc d1 = new DigitalVideoDisc("Christopher Nolan", "Action", "Inception", 148, 19.99);
        DigitalVideoDisc d2 = new DigitalVideoDisc("James Cameron", "Sci-Fi", "Avatar", 162, 24.50);
        DigitalVideoDisc d3 = new DigitalVideoDisc("Peter Jackson", "Fantasy", "The Lord of the Rings", 178, 29.00);
        DigitalVideoDisc d4 = new DigitalVideoDisc("Anthony Russo", "Superhero", "Avengers: Endgame", 181, 27.99);
        DigitalVideoDisc d5 = new DigitalVideoDisc("George Lucas", "Sci-Fi", "Star Wars", 121, 21.50);
        DigitalVideoDisc d6 = new DigitalVideoDisc("Steven Spielberg", "Adventure", "Jurassic Park", 127, 18.75);
        DigitalVideoDisc d7 = new DigitalVideoDisc("Ridley Scott", "Horror", "Alien", 117, 16.00);

        ss.addDVD(d1);
        ss.addDVD(d2);
        ss.addDVD(d3);
        ss.removeDVD(d2);
        ss.addDVD(d4);
        ss.addDVD(d5);
        ss.addDVD(d6);
        ss.addDVD(d7);
        ss.removeDVD(d4);
        ss.removeDVD(d4);
    


    }
}
