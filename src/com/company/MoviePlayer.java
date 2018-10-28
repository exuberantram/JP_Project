package com.company;

/**
 * @author      Victoria Bagnall
 * @version     2
 * @since       1
 */

//class to set up a movie player that takes into account the monitor name, screen, and type
public class MoviePlayer extends Product implements MultimediaControl {

    //initialize class variables
    private Screen screen;
    private MonitorType monitorType;

    //default constructor
    public MoviePlayer(){
        screen = new Screen();
        monitorType = MonitorType.LCD;
    }

    //constructor to pass the name, screen elements, and monitor type
    public MoviePlayer(String name, Screen screen, MonitorType mType){
        super(name);
        //calls screen and passes the resolution, refresh rate, and response time
        this.screen = screen;
        this.monitorType = mType;
    }

    @Override
    public void play(){
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

    public void previous () {
        System.out.println("Previous movie");
    }

    public String toString(){
        return
                super.toString() +
                        screen.toString() + "\n" +
                        "Monitor Type: " + monitorType;
    }

}
