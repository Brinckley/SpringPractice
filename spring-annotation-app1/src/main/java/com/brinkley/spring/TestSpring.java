package com.brinkley.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        boolean flagWork = true;
        Computer computer = context.getBean("computer", Computer.class);
        computer.getPlayerInfo();
        do {
            System.out.println("\nClassical music  --  1");
            System.out.println("Rock music  --  2");
            System.out.println("Synth music  --  3");
            System.out.println("Exit  --  4");

            System.out.println("Input number of the genre you want to listen to:");
            int songUser;
            Scanner in = new Scanner(System.in);
            try {
                songUser = in.nextInt() - 1;
            } catch (NumberFormatException exception) {
                songUser = 2;
            }
            System.out.println("\n");
            if (songUser >= 0 && songUser <= 2) {
                System.out.println(computer.ToString());
                computer.setOnComposition(Genre.values()[songUser]);
            } else if (songUser == 3) {
                flagWork = false;
            } else {
                System.out.println("Choose another number!");
            }
        } while (flagWork);


        //Music music = context.getBean("rockMusic", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        //musicPlayer.playMusic();
        //Music music2 = context.getBean("classicalMusic", Music.class);
        //MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
        //classicalMusicPlayer.playMusic();

        context.close();
    }


}
