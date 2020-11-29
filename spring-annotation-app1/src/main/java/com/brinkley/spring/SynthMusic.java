package com.brinkley.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

//@Component
//@Scope("prototype")
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
