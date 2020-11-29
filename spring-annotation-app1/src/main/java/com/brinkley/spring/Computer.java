package com.brinkley.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        id = 1;
    }

    public void setOnComposition(Genre genre) {
        musicPlayer.playMusic(genre);
    }

    public String ToString() {
        return "Computer " + id + "@@@";
    }
}
