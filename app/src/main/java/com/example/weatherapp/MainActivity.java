package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//Activity represent more or less a screen within an android app
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // On create method sets up the GUI
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openForecast(View view) {
        // Open forecast button click handler in JAVA
        //1. Create an Intent for opening ForecastActivity
        Intent intent = new Intent(this, ForecastActivity.class);
        //2. Send some data to the other activity with the
        intent.putExtra("CITY_NAME", "Tampere");
        //3. Start the activity through the intent
        startActivity(intent);
    }

    public void updateWeather(View view) {
        //Fetch the weather data from some weather API providing server
        //Let's now just update some random data in the display
        String weatherDescription = "Cloudy";
        float temperature = 5.4f;
        float windSpeed = 2.0f;

        //We want to update these on the screen
        TextView weatherDescriptionTextView = findViewById(R.id.textViewWeatherDescription);
        weatherDescriptionTextView.setText(weatherDescription);

        TextView temperatureTextView = findViewById(R.id.textViewTemperture);
        temperatureTextView.setText("" + temperature + "C");

        TextView windSpeedTextView = findViewById(R.id.textViewWindSpeed);
        windSpeedTextView.setText("" + windSpeed + "m/s");
    }
}