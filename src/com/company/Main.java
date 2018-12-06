/**
 * Main method contains the user interface
 * allows the user to view current products, add a product, return to start, or exit.
 *
 * @author Victoria Bagnall
 * @version 2
 * @serial
 * @since 1
 */

package com.company;

import java.sql.SQLOutput;
import java.util.*;

class Main {
    public static void main(String[] args) {
//
//        //create an ArrayList of products
//        ArrayList<Product> products = new ArrayList<>();
//        //call testCollection and assign results to ArrayList
//        products = testCollection();
//        //sort the ArrayList
//        Collections.sort(products);
//        //call print method for ArrayList
//        print(products);
//    }
//
//    // Step 15
//    // Complete the header for the testCollection method here
//
//    public static ArrayList testCollection() {
//
//        AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
//        AudioPlayer a2 = new AudioPlayer("Walkman", "WAV");
//        MoviePlayer m1 = new MoviePlayer("DBPOWER MK 101", new Screen(
//                "720x480", 40, 22), MonitorType.LCD);
//        MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK", new Screen(
//                "1366x768", 40, 22), MonitorType.LED);
//
//        // create the collection
//        ArrayList<Product> products = new ArrayList<>();
//
//        products.add(a1);
//        products.add(a2);
//        products.add(m1);
//        products.add(m2);
//        return products;
//    }
        int menuChoice = 0;
        int productMenuChoice = 0;
        Scanner scan = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        boolean programstate = true;

        System.out.println(" ");

        do {
            do {
                System.out.println("Hello, and Welcome to OraclProduction.");
                System.out.println("What would you like to do today?");
                System.out.println(" ");
                System.out.println("1: Display Product Collection");
                System.out.println("2: Add a New Product");
                System.out.println("3: Exit the System");

                try {
                    menuChoice = scan.nextInt();
                } catch (InputMismatchException ime) {
                    System.out.println("Input doesn't match");
                    System.out.println("Please try again");
                    scan.nextLine(); // to empty the scanner
                }
            } while (menuChoice < 1 || menuChoice > 3); // until a correct integer is entered, main menu repeats

            switch (menuChoice) {
                case 1: // for displaying the product collection.
                    if (products.isEmpty()) {
                        System.out.println("No products are currently in the system");
                    } else {
                        Collections.sort(products);
                        print(products);
                    }
                    break;

                case 2: //to allow the user to add a new product
                    do {
                        System.out.println("Which product would you like to add?");
                        System.out.println(" ");
                        System.out.println("1: Audio Player");
                        System.out.println("2: Movie Player");
                        System.out.println("3: Return to Main Menu");

                        try {
                            productMenuChoice = scan.nextInt();
                        } catch (InputMismatchException ime) {
                            System.out.println("Input is mis-matched");
                            System.out.println("Please try again");
                            scan.nextLine(); // to empty the scanner
                        }

                    } while (productMenuChoice < 1 || productMenuChoice > 3);

                    switch (productMenuChoice) {
                        case 1: //adds Audio Player
                            AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
                            products.add(a1);
                            System.out.println("Added Audio Player");
                            scan.nextLine(); //clears the scanner
                            break; //ends case for audio player
                        case 2: //adds movie player
                            MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
                                    new Screen(" 720x480", 40, 22), MonitorType.LCD);
                            products.add(m1);
                            System.out.println("Added Movie Player");
                            scan.nextLine();
                            break; //ends case for movie player
                        default: //start default to return to previous menu
                            break; // end the default to return to previous menu
                    }
                    break; // end main menu case 1 (add new product)
                case 3: // allows the user to exit the system
                    System.out.println("Thank you for visiting!");
                    programstate = false;
                    break; //ends case 3 and exits the system

                default: // start default to exit the system
                    System.out.println("Thank you for visiting!");
                    programstate = false;
                    break;

            }
        } while (programstate); //ends loop. User exits system if false.

//EmployeeInfo em = new EmployeeInfo();
//        System.out.println(em.toString());

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