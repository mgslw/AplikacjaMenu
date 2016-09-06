package com.example.magda.aplikacjamenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int cenaKotlet = 15;
    int cenaKluska = 12;
    int cenaZupa = 5;
    int cenaCiach = 4;
    int suma = 0;



    public void onClickKotlet (View view) {
       suma = cenaKotlet + suma;

        TextView sumaTextView = (TextView) findViewById(R.id.suma);

        sumaTextView.setText("SUMA: " + suma + "PLN");

    }


    public void onClickKluska (View view) {
        suma = cenaKluska + suma;

        TextView sumaTextView = (TextView) findViewById(R.id.suma);

        sumaTextView.setText("SUMA: " + suma + "PLN");
    }

    public void onClickZupa (View view) {
        suma = cenaZupa + suma;

        TextView sumaTextView = (TextView) findViewById(R.id.suma);

        sumaTextView.setText("SUMA: " + suma + "PLN");
    }

    public void onClickCiach (View view){
        suma = cenaCiach + suma;

        TextView sumaTextView = (TextView) findViewById(R.id.suma);

        sumaTextView.setText("SUMA: " + suma + "PLN");
    }

    public void onToggleButtonClicked(View view)   {
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton);

        if (toggleButton.isChecked() ) {
            cenaKotlet = 13;
            cenaKluska = 10;
            cenaCiach = 7;
            cenaZupa = 2;
        } else {
            cenaKotlet = 15;
            cenaKluska = 12;
            cenaCiach = 5;
            cenaZupa = 4;
        }
    }

}
