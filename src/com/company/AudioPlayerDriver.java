package com.company;
/**
 * @author      Victoria Bagnall
 * @version     2
 * @since       1
 */

// driver class to test audio player
public class AudioPlayerDriver {
    public static void testAudioPlayer(){


        AudioPlayer Audio = new AudioPlayer("iPod Mini", "MP3");
        AudioPlayer Audio2 = new AudioPlayer("Walkman", "WAV");

        Audio.play();
        Audio.stop();
        Audio.next();
        Audio.previous();

        System.out.println(Audio);
        System.out.println(Audio2);


    }
}