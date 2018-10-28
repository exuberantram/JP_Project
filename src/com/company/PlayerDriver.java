package com.company;
/**
 * @author      Victoria Bagnall
 * @version     2
 * @since       1
 */

//driver class to test the audio and movie players together
public class PlayerDriver {

    public static void testPlayer() {

        //initialize audioplayer and movieplayer variables
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