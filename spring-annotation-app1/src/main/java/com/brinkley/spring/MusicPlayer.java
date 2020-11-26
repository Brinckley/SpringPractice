package com.brinkley.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    //@Autowired
    //private Music music;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private SynthMusic synthMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, SynthMusic synthMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.synthMusic = synthMusic;
    }

    //@Autowired
    //public void setMusic(@Qualifier("classicalMusic") Music music) {
    //    this.music = music;
    //}
    public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong());
        System.out.println("Next: " + rockMusic.getSong());
        System.out.println("Next: " + synthMusic.getSong());
    }

    public String ToString() {
        return "Playing: " + classicalMusic.getSong();
    }
}
