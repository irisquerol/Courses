package com.android.courses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
    int[] subjects = {R.id.subject1, R.id.subject2, R.id.subject3, R.id.subject4, R.id.subject5, R.id.subject6};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * for to iterate array of all subject identifications.
         */
        for (int i = 0; i < subjects.length; i++) {
            LinearLayout subject = findViewById(subjects[i]);
            int pos = i;
            subject.setOnClickListener(v -> {
                openDetailsActivity(pos);
            });

            /**
             * cualdo se clique un linearlayout este cambiará su color de fondo
             */
            subject.setOnTouchListener((view, motionEvent) -> {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    int sky_blue = Color.parseColor("#b3e6ff");
                    subject.setBackgroundColor(sky_blue);
                }
                return false;

            });
        }


    }

    /**
     * Funcion que abre otra actividad con la informacion de la asignatura
     * enviamos la posición del linear layout seleccionado
     * @param pos integer para saber que asignatura tiene que mostrar la otra actividad
     */
    public void openDetailsActivity(int pos) {
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("subjectID", pos);
        startActivity(intent);
    }
}