package com.provineer.peste.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FindBeerActivity extends Activity {

    private ColorFinder colorFinder = new ColorFinder();
    private BeerExpert beerExpert = new BeerExpert();
    private boolean isLightSelected;
    private boolean isDarkSelected;
    private boolean isAmberSelected;
    private boolean isBrownSelected;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

    }

    //get a reference to the checkbo
    public void onCheckBoxClick(View view) {
        // state the type you are casting to.
          // state the name you are giving the casted value
            // set the name equal to the result of the cast
        CheckBox checkBox = (CheckBox)view;

        //1.)figure out which checkbox I have
        //2.) set the boolean to this things is checked value
        System.out.println("Butts!");






    }


    //called when the user clicks the button
    public void onClickFindBeer(View view) {
        //get a reference to the TextView - Android uses R.java to keep track of resources in the app,
        // use it to get references to GUI components from within the activity code


        TextView brands = (TextView) findViewById(R.id.brands);
        //get a reference to the checkbox



        //get a reference to the spinner
        //Spinner color = (Spinner) findViewById(R.id.color);

        //get the selected item in the spinner (valueOf(object))
        //String beerType = String.valueOf(color.getSelectedItem());

        //display the selected item code: brands.setText(beerType);
        



        //Get a list of brand recommendations from the beerExpert class
//        List<String> brandsList = beerExpert.getBrands(beerType);
//
//        // Build a String using values from that list
//        StringBuilder brandsFormatted = new StringBuilder();
//        for (String brand : brandsList) {
//            brandsFormatted.append(brand).append('\n'); //display each brand on a new line
//        }
//        // display the string in the TextView
//        brands.setText(brandsFormatted);


    }
}
