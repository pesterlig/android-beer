package com.provineer.peste.beeradviser;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peste on 8/28/2018.
 */

public class ColorFinder {

    private List<String> colors;

    public ColorFinder() {
        this.colors = colors;
    }

    public List<String> getColors(String checkBoxText) {
        List<String> colors = new ArrayList<>();
        colors.add(checkBoxText);

        return colors;
    }

}


//    public List<String> getBrands(String color){
//        List<String> brands = new ArrayList<>();
//        if (color.equals("amber")){
//            brands.add("Eliot Ness Amber Lager");
//            brands.add("Nosferatu Imperial Red Ale");
//        }else if (color.equals("light")){
//            brands.add("Holy Moses White Ale");
//            brands.add("Twisted Sister Pale Ale");
//        }else if (color.equals("brown")){
//            brands.add("Froth of Kahn Brown Ale");
//            brands.add("Chocolate Cherry Muckle Scottish Heavy Ale");
//        }else {
//            brands.add("Edmund Fitzgerald Porter");
//            brands.add("Casked Match Porter");
//        }
//        return brands;



