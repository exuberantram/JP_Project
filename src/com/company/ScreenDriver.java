package com.company;

/**
 * @author Victoria Bagnall
 * @version 2
 * @since 1
 */

// a driver class to test the Screen class (part of step 10)
public class ScreenDriver {
    public static void main(String[] args) {
        Screen s = new Screen("1024x768", 60, 10);
        System.out.println(s);
    }
}
