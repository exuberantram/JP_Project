package com.company;

/**
 * @author Victoria Bagnall
 * @version 2
 * @serial
 * @since 1
 */

//driver class to test the audio and movie players together
public class PlayerDriver {

    //Method to test the MoviePlayer and AudioPlayer class in main
    public static void testPlayer() {

        //Creating AudioPlayer and MoviePlayer objects to test multimedia control interface
        AudioPlayer Audio = new AudioPlayer();
        MoviePlayer Movie = new MoviePlayer();

        //Method calls to the multimedia control interface methods
        Audio.next();
        Audio.play();
        Audio.previous();
        Audio.stop();
        Movie.next();
        Movie.play();
        Movie.previous();
        Movie.stop();
    }
}