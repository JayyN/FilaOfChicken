package com.pattersonhs.jaylinn.filaofchicken;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RadioButton;

public class FilaofchickenactivityMainActivity extends AppCompatActivity {

    TextView Title;
    Button Fries;
    Button Nuggets;
    Button Drinks;
    RadioButton Smallfrie;
    RadioButton Mediumfrie;
    RadioButton Largefrie;
    RadioButton TenpcNugget;
    RadioButton TwentypcNugget;
    RadioButton ThirtypcNugget;
    RadioButton Smalldrink;
    RadioButton Mediumdrink;
    RadioButton Largedrink;
    double price;
    TextView showprice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filaofchickenactivity_main);

        Title = (TextView) findViewById(R.id.title);
        Fries = (Button) findViewById(R.id.Fries);
        Nuggets = (Button) findViewById(R.id.Nuggets);
        Drinks = (Button) findViewById(R.id.Drinks);
        Smallfrie = (RadioButton) findViewById(R.id.Smallfrie);
        Mediumfrie = (RadioButton) findViewById(R.id.Mediumfrie);
        Largefrie = (RadioButton) findViewById(R.id.Largefrie);
        TenpcNugget = (RadioButton) findViewById(R.id.TenpcNugget);
        TwentypcNugget = (RadioButton) findViewById(R.id.TwentypcNugget);
        ThirtypcNugget = (RadioButton) findViewById(R.id.ThirtypcNugget);
        Smalldrink = (RadioButton) findViewById(R.id.Smalldrink);
        Mediumdrink = (RadioButton) findViewById(R.id.Mediumdrink);
        Largedrink = (RadioButton) findViewById(R.id.Largedrink);
        price = 0.00;
        showprice = (TextView) findViewById(R.id.Price);

        Fries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent FriesIntent = new Intent( FilaofchickenactivityMainActivity.this, FriesActivity.class);
                startActivity(FriesIntent);

            }
        });
        Nuggets.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent NuggetsIntent = new Intent(FilaofchickenactivityMainActivity.this, NuggetsActivity.class);
                startActivity(NuggetsIntent);
            }
        });
        Drinks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent DrinksIntent = new Intent(FilaofchickenactivityMainActivity.this, DrinksActivity.class);
                startActivity(DrinksIntent);
            }
        });

        //Small.setOnClickListener(new View.OnClickListener()){

        //}


    }
}
