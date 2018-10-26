/**
 * Victoria Bagnall
 * OOP Program Alpha
 */
package com.company;

//importing java utilities to allow creation of a date method

import java.util.Date;

/*An abstract class can't be instantiated. Similar to interfaces but can have concrete classes
as well*/
public abstract class Product implements Item, Comparable<Product> {

    //Declaring class variables
    private int serialNumber;
    private String manufacturer;
    private Date manufacturedOn;
    private String name;

    private static int currentProductionNumber = 1;

    public Product() {
        name = "Default Name";
        serialNumber = currentProductionNumber++;
        manufacturedOn = new Date();
        manufacturer = Item.manufacturer;
    }

    //Constructor taking the String name as a parameter
    public Product(String name) {
        this.name = name;
        serialNumber = currentProductionNumber++;
        manufacturedOn = new Date();
        manufacturer = Item.manufacturer;
    }

    //Implementation of the interface methods
    public void setProductionNumber(int pn) {
        currentProductionNumber = pn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getManufacturerDate() {
        return manufacturedOn;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public int compareTo(Product prod) {
        this.name.compareTo(prod.getName());
        int ans;
        ans = this.name.compareTo(prod.getName());
        return ans;
    }

    //Formatting the toString method to print a pre-formatted message
    public String toString() {
        return
                "Manufacturer : " + manufacturer + "\n"
                        + "Serial Number : " + serialNumber + "\n"
                        + "Date : " + manufacturedOn + "\n"
                        + "Name : " + name + "\n";
    }
}
