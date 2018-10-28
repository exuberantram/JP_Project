package com.company;

/**
 * @author      Victoria Bagnall
 * @version     2
 * @since       1
 */

public class AudioPlayer extends Product implements MultimediaControl {

    private String audioSpecification;
    private ItemType mediaType;

    public AudioPlayer() {
        this.audioSpecification = audioSpecification;
        mediaType = ItemType.AUDIO;
    }

    public AudioPlayer(String name, String audioSpecification) {
        super(name);
        this.audioSpecification = audioSpecification;
        mediaType = ItemType.AUDIO;
    }

    public void play() {
        System.out.println("Playing");
    }

    public void stop() {
        System.out.println("Stopping");
    }

    public void previous() {
        System.out.println("Previous");
    }

    public void next() {
        System.out.println("Next");
    }

    public String toString() {
        return super.toString()
                + "Audio Spec : " + audioSpecification + "\n"
                + "Item Type : " + mediaType + "\n";
    }
}