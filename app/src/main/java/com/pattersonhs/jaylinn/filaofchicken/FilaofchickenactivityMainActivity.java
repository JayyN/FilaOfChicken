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
    Button ChickenSandwhich;
    Button Drinks;
    Button Sauces;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filaofchickenactivity_main);

        Title = (TextView) findViewById(R.id.title);
        Fries = (Button) findViewById(R.id.Fries);
        Nuggets = (Button) findViewById(R.id.Nuggets);
        ChickenSandwhich = (Button) findViewById(R.id.ChickenSandwhich);
        Drinks = (Button) findViewById(R.id.Drinks);
        Sauces = (Button) findViewById(R.id.Sauces);

        Fries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent FriesIntent = new Intent( FilaofchickenactivityMainActivity.this, FriesActivity.class);
                //startActivity(FriesActivity);
            }
        });

    }
}
