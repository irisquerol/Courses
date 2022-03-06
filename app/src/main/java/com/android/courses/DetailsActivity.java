package com.android.courses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        String[] titles = getResources().getStringArray(R.array.titles);
        String[] descriptions = getResources().getStringArray(R.array.longdescription);
        String[] teachers = getResources().getStringArray(R.array.teachers);
        String[] credits = getResources().getStringArray(R.array.credits);
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