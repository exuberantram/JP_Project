package com.company;

public class MoviePlayer extends Product implements MultimediaControl {

    private Screen screen;
    private MonitorType monitorType;

    public MoviePlayer(){
        screen = new Screen();
        monitorType = MonitorType.LCD;
    }

    public MoviePlayer(String name, Screen screen, MonitorType mType){
        super(name);
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
