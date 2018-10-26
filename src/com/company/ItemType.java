/**
 * Victoria Bagnall
 * OOP Program Alpha
 */

package com.company;

// create enum of ItemType
public enum ItemType {

    //Creating each type of ItemType that is currently in production
    AUDIO("AU"),
    VISUAL("VI"),
    AUDIO_MOBILE("AM"),
    AUDIO_VISUAL("VM");

    //A String to attribute each type to a variable
    public final String code;

    //Constructor to allow the use of Type outside of the ItemType enum
    ItemType(String code) {
        this.code = code;
    }

    //Get method so the private String type can be accessed outside of this class
    public String getCode(){
        return code;
    }
}
