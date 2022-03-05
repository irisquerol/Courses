package com.android.courses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int[] subjects = {R.id.subject1, R.id.subject2, R.id.subject3, R.id.subject4, R.id.subject6, R.id.subject6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int id : subjects) {
            LinearLayout subject = findViewById(id);
            subject.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showToast(1, id);
                    openDetailsActivity(id);
                }
            });
        }

   /*       LinearLayout course2 = findViewById(R.id.course2);
        course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(1);
                openDetailsActivity();
                //Intent picture_intent = new Intent(MainActivity.this,Activity2.class);
                //startActivity(picture_intent );
            }
        });
      LinearLayout course3 = findViewById(R.id.course3);
        course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(1);
                openDetailsActivity();
            }
        });*/
    }

    private void showToast(int type, int id) {
        Toast t;
        t = Toast.makeText(MainActivity.this,
                "click" + id, Toast.LENGTH_SHORT);
        if (type == 0) {
            t = Toast.makeText(MainActivity.this,
                    "click", Toast.LENGTH_SHORT);
        } else if (type == 1) {
            //PlayerX Win
        } else {
            ;//PlayerX Win
        }
        t.show();
    }

    public void openDetailsActivity(int intSubject) {
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("subjectID", intSubject);
        startActivity(intent);
    }
}