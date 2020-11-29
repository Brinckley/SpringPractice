package com.brinkley.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RockMusic implements Music {
    private ArrayList<String> rockList;

    @Override
    public ArrayList<String> getSongs() {
        if(rockList == null){
            rockList = new ArrayList<>();
            rockList.add("Bleed");
            rockList.add("Stargazer");
            rockList.add("Children of the sea");
        }
        return rockList;
    }
}
