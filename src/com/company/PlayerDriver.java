package com.company;

public class PlayerDriver {
    public static void testPlayer() {

        AudioPlayer Audio = new AudioPlayer();
        MoviePlayer Movie = new MoviePlayer();

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