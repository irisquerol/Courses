package com.android.courses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intentReciver = getIntent();
        int intValue = intentReciver.getIntExtra("subjectID", 0);

        setContentView(R.layout.activity_details);
        TextView textView = (TextView) findViewById(R.id.title1);
        Log.d("myTag", "This is the  variable value: " + intValue);
        textView.setText("text you want to display" + intValue);


    }
}