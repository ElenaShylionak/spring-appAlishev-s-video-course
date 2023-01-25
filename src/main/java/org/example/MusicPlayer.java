package org.example;
// Will apply the inversion of control (Будем применять инверсию управления)

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}