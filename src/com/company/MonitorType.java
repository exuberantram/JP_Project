package com.company;

public enum MonitorType {

    LCD("LCD"),
    LED("LED");

    //A String to attribute each type to a variable
    private final String Type;

    //Constructor to allow the use of Type outside of the MonitorType enum
    MonitorType(String Type) {
        this.Type = Type;
    }

    //Get method so the private String type can be accessed outside of this class
    public String getType(){
        return Type;
    }
}