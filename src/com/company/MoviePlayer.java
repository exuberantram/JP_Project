package com.company;

/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

/**
 * MoviePlayer extends the abstract class Product
 * sets up a movie player that takes into account the monitor name, screen, and type
 *
 * @author Victoria Bagnall
 * @version 2
 * @serial
 * @since 1
 */

//class to set up a movie player that takes into account the monitor name, screen, and type
public class MoviePlayer extends Product implements MultimediaControl {

    //initialize class variables
    private Screen screen;
    private MonitorType monitorType;

    //default constructor
    public MoviePlayer() {
        screen = new Screen();
        monitorType = MonitorType.LCD;
    }

    //constructor to pass the name, screen elements, and monitor type
    public MoviePlayer(String name, Screen screen, MonitorType mType) {
        super(name);
        //calls screen and passes the resolution, refresh rate, and response time
        this.screen = screen;
        this.monitorType = mType;
    }

    @Override
    public void play() {
        System.out.println("Playing movie");
    }

    @Override
    public void stop() {
        System.out.println("Stopping movie");
    }

    @Override
    public void next() {
        System.out.println("Next movie");
    }

    public void previous() {
        System.out.println("Previous movie");
    }

    public String toString() {
        return
                super.toString() +
                        screen.toString() + "\n" +
                        "Monitor Type: " + monitorType;
    }

}
