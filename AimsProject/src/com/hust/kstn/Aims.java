package com.hust.kstn;

import com.hust.kstn.models.*;

public class Aims {
    public static void main(String[] args) {
        Cart cc = new Cart();

        DigitalVideoDisc notInCart = new DigitalVideoDisc("Unknown Director", "Mystery", "Ghost Disc", 90, 9.99);
        cc.removeDVD(notInCart);
        System.out.println();

        DigitalVideoDisc d1 = new DigitalVideoDisc("Christopher Nolan", "Action", "Inception", 148, 19.99);
        DigitalVideoDisc d2 = new DigitalVideoDisc("James Cameron", "Sci-Fi", "Avatar", 162, 24.50);
        DigitalVideoDisc d3 = new DigitalVideoDisc("Peter Jackson", "Fantasy", "The Lord of the Rings", 178, 29.00);
        DigitalVideoDisc d4 = new DigitalVideoDisc("Anthony Russo", "Superhero", "Avengers: Endgame", 181, 27.99);
        DigitalVideoDisc d5 = new DigitalVideoDisc("George Lucas", "Sci-Fi", "Star Wars", 121, 21.50);
        DigitalVideoDisc d6 = new DigitalVideoDisc("Steven Spielberg", "Adventure", "Jurassic Park", 127, 18.75);
        DigitalVideoDisc d7 = new DigitalVideoDisc("Ridley Scott", "Horror", "Alien", 117, 16.00);

        cc.addDVD(d1);
        cc.addDVD(d2);
        cc.addDVD(d3);
        cc.addDVD(d4);
        cc.addDVD(d5);
        cc.addDVD(d6);
        cc.addDVD(d7);

        System.out.println();
        cc.print();
        System.out.println( cc.calculateTotalCost());
        System.out.println();

        cc.removeDVD(d3);
        cc.removeDVD(d1);
        cc.removeDVD(notInCart);
        cc.print();
        System.out.println(cc.calculateTotalCost());
    }
}