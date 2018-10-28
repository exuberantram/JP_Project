/**
 * @author      Victoria Bagnall
 * @version     2
 * @since       1
 */

package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    public static void main(String[] args) {

        //create an ArrayList of products
        ArrayList<Product> products = new ArrayList<>();
        //call testCollection and assign results to ArrayList
        products = testCollection();
        //sort the ArrayList
        Collections.sort(products);
        //call print method for ArrayList
        print(products);
    }

    // Step 15
    // Complete the header for the testCollection method here

    public static ArrayList testCollection() {

        AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
        AudioPlayer a2 = new AudioPlayer("Walkman", "WAV");
        MoviePlayer m1 = new MoviePlayer("DBPOWER MK 101", new Screen(
                "720x480", 40, 22), MonitorType.LCD);
        MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK", new Screen(
                "1366x768", 40, 22), MonitorType.LED);

        // create the collection
        ArrayList<Product> products = new ArrayList<>();

        products.add(a1);
        products.add(a2);
        products.add(m1);
        products.add(m2);
        return products;
    }

    //Step 16
    //print method for ArrayList
    public static <T extends Iterable<E>, E> void print(T list) {

        for (E element : list) {
            System.out.println(element);
        }
        System.out.println();
    }
}