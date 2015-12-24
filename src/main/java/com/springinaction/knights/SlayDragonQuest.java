package com.springinaction.knights;

import java.io.PrintStream;

/**
 * Created by iancu_000 on 03-Oct-15.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
