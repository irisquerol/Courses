package com.android.courses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    private LinearLayout assig1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        assig1 = (LinearLayout) findViewById(R.id.assig1);
        assig1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
