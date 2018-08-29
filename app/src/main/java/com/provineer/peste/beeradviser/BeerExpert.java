package com.provineer.peste.beeradviser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by peste on 7/25/2018.
 */

public class BeerExpert {

    private List<String> brands;

    public BeerExpert() {
        this.brands = brands;
    }


    public List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")){
            brands.add("Eliot Ness Amber Lager");
            brands.add("Nosferatu Imperial Red Ale");
        }else if (color.equals("light")){
            brands.add("Holy Moses White Ale");
            brands.add("Twisted Sister Pale Ale");
        }else if (color.equals("brown")){
            brands.add("Froth of Kahn Brown Ale");
            brands.add("Chocolate Cherry Muckle Scottish Heavy Ale");
        }else {
            brands.add("Edmund Fitzgerald Porter");
            brands.add("Casked Match Porter");
        }
        return brands;
    }





}
