/**
 * @author      Victoria Bagnall
 * @version     2
 * @since       1
 */
package com.company;

//Java utilities allow creation of date method

import java.util.Date;

/*Abstract classes can't be instantiated. They can have concrete classes but are still like interfaces. */
public abstract class Product implements Item, Comparable<Product> {

    //Declaring class variables
    private int serialNumber;
    private String manufacturer;
    private Date manufacturedOn;
    private String name;

    private static int currentProductionNumber = 1;

    //Default constructor for Product
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

    //getters and setters
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

    /*enabling functionality to allow classes to be sorted by name with Collections.sort*/
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
