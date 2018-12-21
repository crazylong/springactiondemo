package com.coderlong.springactiondemo;

import java.io.PrintStream;

/**
 * @autor Long Qiong
 * @create 2017/10/24
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
