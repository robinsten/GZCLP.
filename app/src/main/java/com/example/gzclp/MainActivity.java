package com.example.gzclp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button neueUebungen = findViewById(R.id.newExercises);

        neueUebungen.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, NeueUebungen.class);
            startActivity(intent);
        });

    }
}

