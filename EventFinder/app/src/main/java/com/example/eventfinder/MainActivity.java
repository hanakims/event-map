package com.example.eventfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Switch to map view
     * @param view -- the view that is clicked
     */
    public void map(View view){
        // Create an Intent to start the second activity
        Intent mapsIntent = new Intent(this, MapsActivity.class);

        // Start the new activity.
        startActivity(mapsIntent);
    }
}
