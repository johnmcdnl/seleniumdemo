package com.johnmcd.seleniumdemo;

public class Pause {
    public static void pause() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
