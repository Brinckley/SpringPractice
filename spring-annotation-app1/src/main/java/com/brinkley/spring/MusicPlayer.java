package com.brinkley.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

enum Genre { Classic, Rock, Synth }

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String Name;
    @Value("${musicPlayer.volume}")
    private int Volume;

    //@Autowired
    private Music music1;
    private Music music2;
    private Music music3;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2,
                       @Qualifier("synthMusic") Music music3){
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public void playMusic(Genre genre) {
        String songName = "";
        int random = new Random().nextInt(2);
        switch (genre){
            case Classic:
                songName = music1.getSongs().get(random);
                break;
            case Rock:
                songName = music2.getSongs().get(random);
                break;
            case Synth:
                songName = music3.getSongs().get(random);
                break;
        }
        System.out.println("Playing >> " + songName);
    }

    public String getName() {
        return Name;
    }

    public int getVolume() {
        return Volume;
    }
}
