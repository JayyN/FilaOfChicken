package com.pattersonhs.jaylinn.filaofchicken;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FilaofchickenactivityMainActivity extends AppCompatActivity {

    TextView Title;
    Button Fries;
    Button Nuggets;
    Button Drinks;
    Button ChickenSandwhich;
    Button Sauces;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filaofchickenactivity_main);

        Title = (TextView) findViewById(R.id.title);
        Fries = (Button) findViewById(R.id.Fries);
        Nuggets = (Button) findViewById(R.id.Nuggets);
        Drinks = (Button) findViewById(R.id.Drinks);
        ChickenSandwhich = (Button) findViewById(R.id.ChickenSandwhich);
        Sauces = (Button) findViewById(R.id.Sauces);

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


    }
}
