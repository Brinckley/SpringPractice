package com.brinkley.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        id = 1;
    }

    public void getPlayerInfo(){
        System.out.println("Name:   " + musicPlayer.getName());
        System.out.println("Volume:   " + musicPlayer.getVolume());
    }

    public void setOnComposition(Genre genre) {
        musicPlayer.playMusic(genre);
    }

    public String ToString() {
        return "Computer " + id + "@@@";
    }

    @PostConstruct
    private void doMyInit() {
        System.out.println("Starting the computer " + id);
    }

    @PreDestroy
    private void doMyDestroy(){
        System.out.println("Turning of the computer " + id);
    }
}
