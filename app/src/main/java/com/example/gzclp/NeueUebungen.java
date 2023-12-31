package com.example.gzclp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class NeueUebungen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.neue_uebungen);

        TextView Name = findViewById(R.id.Uebungsname);
        TextView Gewicht = findViewById(R.id.Uebungsgewicht);
        TextView WhichDay = findViewById(R.id.addOnWhichDay);

        Button T1 = findViewById(R.id.saveAsT1);
        Button T2 = findViewById(R.id.saveAsT2);
        Button T3 = findViewById(R.id.saveAsT3);
        UebungenDataSource uebungen = new UebungenDataSource(this);
        uebungen.open();
        T1.setOnClickListener(view -> {
            String Uebungsname = Name.getText().toString();
           double Uebungsgewicht = Double.parseDouble(Gewicht.getText().toString());
           int Uebungstag = Integer.parseInt(WhichDay.getText().toString());

            uebungen.insertUebung(Uebungsname,Uebungsgewicht,"T1", 1,Uebungstag);
            uebungen.close();
            Toast.makeText(getApplicationContext(), "Übung als T1 erfolgreich hinzugefügt!", Toast.LENGTH_SHORT).show();
            finish();
        });

        T2.setOnClickListener(view -> {
            String Uebungsname = Name.getText().toString();
            double Uebungsgewicht = Double.parseDouble(Gewicht.getText().toString());
            int Uebungstag = Integer.parseInt(WhichDay.getText().toString());

            uebungen.insertUebung(Uebungsname,Uebungsgewicht,"T2",1,Uebungstag);
            uebungen.close();
            Toast.makeText(getApplicationContext(), "Übung als T2 erfolgreich hinzugefügt!", Toast.LENGTH_SHORT).show();
            finish();

        });
        T3.setOnClickListener(view -> {
            String Uebungsname = Name.getText().toString();
            double Uebungsgewicht = Double.parseDouble(Gewicht.getText().toString());
            int Uebungstag = Integer.parseInt(WhichDay.getText().toString());

            uebungen.insertUebung(Uebungsname,Uebungsgewicht,"T3",1,Uebungstag);
            uebungen.close();
            Toast.makeText(getApplicationContext(), "Übung als T3 erfolgreich hinzugefügt!", Toast.LENGTH_SHORT).show();
            finish();
        });

    }

}
