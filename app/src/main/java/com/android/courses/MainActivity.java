package com.android.courses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int[] subjects = {R.id.subject1, R.id.subject2, R.id.subject3, R.id.subject4, R.id.subject5, R.id.subject6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < subjects.length; i++) {
            LinearLayout subject = findViewById(subjects[i]);
            int pos = i;
            subject.setOnClickListener(v -> {
                //showToast(1, i);
                openDetailsActivity(pos);
            });
        }
    }

    private void showToast(int id) {
        Toast t;
        t = Toast.makeText(MainActivity.this,
                "click" + id, Toast.LENGTH_SHORT);
        t.show();
    }

    public void openDetailsActivity(int pos) {
        //showToast(pos);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("subjectID", pos);
        startActivity(intent);
    }
}