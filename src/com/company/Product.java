/**
 * Victoria Bagnall
 * OOP Program Alpha
 */
package com.company;

import java.util.Date;

//    create an abstract type called Product that implements Item interface
public abstract class Product implements Item {

//    Product will implement the basic functionality that all items on a production line should have

    private int serialNumber;
    private String manufacturer;
    private Date manufacturedOn;
    private String name;

//    Add an integer class variable called currentProductionNumber.
//    This will store the next number to be assigned to serialNumber.

    private int currentProductionNumber = 0;

//    Constructor that will take in the name of the product and set this to the field variable name
//    assign a serial number from the currentProductionNumber
//    currentProductionNumber should be incremented in readiness for the next instance.
//    Set manufacturedOn as the current date and time
    public Product(String n) {
        name = n;
        serialNumber = currentProductionNumber++;
        manufacturedOn = new Date();
    }

//    Add a toString method that will return the following:
//    Manufacturer : OraclProduction
//    Serial Number : 1\n
//    Date : Thu May 14 15:18:43 BST 2015\n
//    Name : Product Name
    public String toString() {
        return "Manufacturer : OraclProduction\n" +
                "Serial Number : 1\n" +
                "Date : Thu May 14 15:18:43 BST 2015\n" +
                "Name : Product Name";
    }

}
