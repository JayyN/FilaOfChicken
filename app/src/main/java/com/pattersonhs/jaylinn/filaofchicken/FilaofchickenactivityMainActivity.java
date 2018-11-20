package com.pattersonhs.jaylinn.filaofchicken;

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
    }
}
