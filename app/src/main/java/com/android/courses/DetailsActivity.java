package com.android.courses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private int id;

    private String[] titles, descriptions, teachers, credits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        titles = getResources().getStringArray(R.array.titles);
        descriptions = getResources().getStringArray(R.array.longdescription);
        teachers = getResources().getStringArray(R.array.teachers);
        credits = getResources().getStringArray(R.array.credits);
        Intent intentGetter = getIntent();
        int intValue = intentGetter.getIntExtra("subjectID", 0);

        setContentView(R.layout.activity_details);
        TextView subjectTitle_tv = findViewById(R.id.subject);
        TextView description_tv = findViewById(R.id.description);
        TextView teacher_tv = findViewById(R.id.teacher);
        TextView credits_tv = findViewById(R.id.credits);
        Log.d("myTag", "This is the  variable value: " + intValue);


        subjectTitle_tv.setText(titles[intValue]);
        description_tv.setText(descriptions[intValue]);
        teacher_tv.setText(teachers[intValue]);
        credits_tv.setText(credits[intValue]);
    }
}