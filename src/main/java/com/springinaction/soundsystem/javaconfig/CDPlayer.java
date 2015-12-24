package com.springinaction.soundsystem.javaconfig;


/**
 * Created by iancu_000 on 08-Nov-15.
 */

public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play(){
        cd.play();
    }
}
