package com.company;

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