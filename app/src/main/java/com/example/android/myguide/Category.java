package com.example.android.myguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static androidx.core.content.ContextCompat.startActivity;

public class Category extends AppCompatActivity {
    public static int activityTracker;  // Static Variable to keep Track of which Actvity Needs to be opened when InfoButton in listItems is clicked.
                                        // Thus, In WordAdapter we can decide based on activityTracker Value, Which ActivityIntent needs to be opened

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Button touristAttr = (Button)findViewById(R.id.tour);
        //touristAttr.setBackgroundColor();
        touristAttr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityTracker = 1;  // If Tourist Attraction TextView is clicked, then it activityTracker is set to 1
                Intent tourIntent = new Intent(Category.this,Tourist.class);
                startActivity(tourIntent);

            }
        });

        Button instiAttr = (Button) findViewById(R.id.insti);
        instiAttr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityTracker = 3;
                Intent instiIntent = new Intent(Category.this,Institute.class);
                startActivity(instiIntent);


            }
        });
    }
}