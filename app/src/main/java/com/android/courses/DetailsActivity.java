package com.android.courses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
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
        ImageView image_banner = findViewById(R.id.imageBanner);
        Log.d("myTag", "This is the  variable value: " + intValue);


        switch (intValue){
            case 0:
                image_banner.setImageResource(R.mipmap.mviles);
                break;
            case 1:
                image_banner.setImageResource(R.mipmap.entornos_web);
                break;
            case 2:
                image_banner.setImageResource(R.mipmap.programacionobjectos);
                break;
            case 3:
                image_banner.setImageResource(R.mipmap.fotografia);
                break;
            case 4:
                image_banner.setImageResource(R.mipmap.careeartech);
                break;
            case 5:
                image_banner.setImageResource(R.mipmap.redes);
                break;
        }

//        if(intValue==0){
//            image_banner.setImageResource(R.mipmap.mviles);
//
//        }


        subjectTitle_tv.setText(titles[intValue]);
        description_tv.setText(descriptions[intValue]);
        teacher_tv.setText(teachers[intValue]);
        credits_tv.setText(credits[intValue]);
    }
}