package com.sam.task;

public class RunnerEar51 {
    public static void main(String[] args) {
        Ear51 ear = new Ear51();
        ear.receiveSound();

        Ear51 e = new Voice();
        e.receiveSound();

        Voice voice = new Voice();
        voice.speak();
        voice.mute();
    }
}
