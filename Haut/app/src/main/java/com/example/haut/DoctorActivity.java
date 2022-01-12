package com.example.haut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DoctorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);

        getSupportActionBar().setTitle("DOCTORS' INFORMATION");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}