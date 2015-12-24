package com.springinaction.soundsystem.javaconfig;


/**
 * Created by iancu_000 on 05-Nov-15.
 */

public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}