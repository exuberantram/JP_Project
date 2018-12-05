package com.company;

/**
 * @author Victoria Bagnall
 * @version 2
 * @serial
 * @since 1
 */

public class Screen implements ScreenSpec {

    //inititalize class variables
    String resolution;
    int refreshRate;
    int responseTime;


    //default constructor
    public Screen() {
        this.resolution = "Default";
        this.refreshRate = 0;
        this.responseTime = 0;
    }

    //constructor to pass the resolution, refreshRate, and responseTime
    public Screen(String resolution,
                  int refreshRate,
                  int responseTime) {
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.responseTime = responseTime;
    }

    //get methods
    @Override
    public String getResolution() {
        return resolution;
    }

    @Override
    public int getRefreshRate() {
        return refreshRate;
    }

    @Override
    public int getResponseTime() {
        return responseTime;
    }

    public String toString() {
        return
                "Screen : Resolution : " + resolution + "\n" +
                        "Refresh rate : " + refreshRate + "\n" +
                        "Response time : " + responseTime;
    }

}
