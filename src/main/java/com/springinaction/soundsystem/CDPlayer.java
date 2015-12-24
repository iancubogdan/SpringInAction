package com.springinaction.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by iancu_000 on 08-Nov-15.
 */
@Component
public class CDPlayer implements MediaPlayer {
    @Autowired
    @Qualifier("sgtPeppers")
    private CompactDisc cd;

    public CDPlayer() {
    }

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play(){
        cd.play();
    }
}
