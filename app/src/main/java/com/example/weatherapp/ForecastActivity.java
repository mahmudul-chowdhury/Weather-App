package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
//import android.widget.TextView;

public class ForecastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        //Read possible intent data
        //If there is CITY_NAME, read it and put it in the screen
        //If strung extra is not there, cityName strung remains null
        String cityName = getIntent().getStringExtra("CITY_NAME");
        TextView weatherForecastCityName = findViewById(R.id.textViewForecastCityName);


        //If there was city name in the message, place it on the screen

        if(cityName != null){
            weatherForecastCityName.setText(cityName);
        }
        else{
            weatherForecastCityName.setText("No");
        }

    }
}