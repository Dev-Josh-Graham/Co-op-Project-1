package com.example.snackbardemo;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    // Setting the instance variables for each button
    private Button btnSnackbar1, btnSnackbar2, btnSnackbar3, btnSnackbar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Associating each button variable to its ID
        btnSnackbar1 = findViewById(R.id.button);
        btnSnackbar2 = findViewById(R.id.button2);
        btnSnackbar3 = findViewById(R.id.button3);
        btnSnackbar4 = findViewById(R.id.button4);

        // Setting anonymous "On Click" listeners for each button
        btnSnackbar1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // Instantiating a Snackbar object
                Snackbar snackbar = Snackbar.make(view, "I'm a plain old snackbar!", BaseTransientBottomBar.LENGTH_LONG);

                // Displaying the Snackbar
                snackbar.show();
            }
        });

        btnSnackbar2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // Instantiating a Snackbar object
                Snackbar snackbar = Snackbar.make(view, "I'm a colorful snackbar!", BaseTransientBottomBar.LENGTH_LONG);

                // Setting the text color of the Snackbar
                snackbar.setTextColor(Color.parseColor("#FF4500"));

                // Displaying the Snackbar
                snackbar.show();
            }
        });

        btnSnackbar3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // Instantiating a Snackbar object
                Snackbar snackbar = Snackbar.make(view, "I'm a fast snackbar!", 1000);

                // Setting the text color of the Snackbar
                snackbar.setTextColor(Color.parseColor("#008b00"));

                // Displaying the Snackbar
                snackbar.show();
            }
        });

        btnSnackbar4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // Instantiating a Snackbar object
                Snackbar snackbar = Snackbar.make(view, "I'm here to stay! (until you're done with me)", BaseTransientBottomBar.LENGTH_INDEFINITE);

                // Setting the text color of the Snackbar
                snackbar.setTextColor(Color.parseColor("#008b00"));

                // Setting the Snackbar action to dismiss the Snackbar
                snackbar.setAction("X", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        snackbar.dismiss();
                    }
                });

                // Setting the text color of the Snackbar action button
                snackbar.setActionTextColor(Color.parseColor("#FF4500"));

                // Displaying the Snackbar
                snackbar.show();
            }
        });
    }
}