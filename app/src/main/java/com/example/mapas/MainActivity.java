package com.example.mapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button hospitales, clinicas, postas, zonariesgo,test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hospitales=findViewById(R.id.btn_hospitales);
        hospitales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, HospitalesActivity.class);
                startActivity(intent);
            }
        });
        clinicas=findViewById(R.id.btn_clinicas);
        clinicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, ClinicasActivity.class);
                startActivity(intent);
            }
        });
        postas=findViewById(R.id.btn_postas);
        postas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, PostasActivity.class);
                startActivity(intent);
            }
        });
        zonariesgo=findViewById(R.id.btn_riesgo);
        zonariesgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, ZonasdeRiesgo.class);
                startActivity(intent);
            }
        });
        test=findViewById(R.id.btn_covid);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, TestCovid.class);
                startActivity(intent);
            }
        });
    }
}
