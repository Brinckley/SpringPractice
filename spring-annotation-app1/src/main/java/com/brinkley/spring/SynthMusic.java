package com.brinkley.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class SynthMusic implements Music {
    private ArrayList<String> synthList;

    @Override
    public ArrayList<String> getSongs() {
        if(synthList == null){
            synthList = new ArrayList<>();
            synthList.add("Sharpen Thy Knife");
            synthList.add("II");
            synthList.add("Dra Sad II");
        }
        return synthList;
    }
}
