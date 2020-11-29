package com.brinkley.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ClassicalMusic implements Music {
    private ArrayList<String> classicList;

    @Override
    public ArrayList<String> getSongs() {
        if(classicList == null){
            classicList = new ArrayList<>();
            classicList.add("Moonlight Sonata");
            classicList.add("Grave. Doppio movimento");
            classicList.add("Die Zauberflöte");
        }
        return classicList;
    }

}
