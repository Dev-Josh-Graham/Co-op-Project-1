package com.example.snackbardemo;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    // Setting the instance variables for each button
    private Button btnSnackbar1, btnSnackbar2, btnSnackbar3, btnSnackbar4, btnSnackbar5;
    private int themestate = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ConstraintLayout layout;
        layout = findViewById(R.id.cl);


        // Associating each button variable to its ID
        btnSnackbar1 = findViewById(R.id.button);
        btnSnackbar2 = findViewById(R.id.button2);
        btnSnackbar3 = findViewById(R.id.button3);
        btnSnackbar4 = findViewById(R.id.button4);
        btnSnackbar5 = findViewById(R.id.button5);

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

        btnSnackbar5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Snackbar snackbar = Snackbar.make(view, "Confirm Theme change?", BaseTransientBottomBar.LENGTH_INDEFINITE);
                snackbar.setAction("Change Theme", new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        if (themestate == 1){
                            themestate = 2;
                            layout.setBackgroundResource(R.color.black);
                            btnSnackbar1.setBackgroundColor(Color.parseColor("#3eab5b"));
                            btnSnackbar2.setBackgroundColor(Color.parseColor("#3eab5b"));
                            btnSnackbar3.setBackgroundColor(Color.parseColor("#3eab5b"));
                            btnSnackbar4.setBackgroundColor(Color.parseColor("#3eab5b"));
                            btnSnackbar5.setBackgroundColor(Color.parseColor("#3eab5b"));
                        }else if(themestate == 2)
                        {
                            themestate = 1;
                            layout.setBackgroundResource(R.color.white);
                            btnSnackbar1.setBackgroundColor(Color.parseColor("#6750a4"));
                            btnSnackbar2.setBackgroundColor(Color.parseColor("#6750a4"));
                            btnSnackbar3.setBackgroundColor(Color.parseColor("#6750a4"));
                            btnSnackbar4.setBackgroundColor(Color.parseColor("#6750a4"));
                            btnSnackbar5.setBackgroundColor(Color.parseColor("#6750a4"));
                        }
                    }
                });

                snackbar.show();
            }

        });
    }
}