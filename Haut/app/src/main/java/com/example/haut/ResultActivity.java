package com.example.haut;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.haut.ui.Fragment1.Fragment1;

public class ResultActivity extends AppCompatActivity {

    TextView textViewHeading;
    ProgressBar progressBar;
    TextView textViewPercent;
    ImageView imageView;
    Button buttonReadMore;
    TextView textViewDoc;
    int max_ind;
    private String title;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        getSupportActionBar().setTitle("RESULT");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        progressBar = findViewById(R.id.progressBar);
        textViewPercent = findViewById(R.id.percent_text_view);
        imageView = findViewById(R.id.imageView);
        buttonReadMore = findViewById(R.id.button_read_more);
        textViewDoc = findViewById(R.id.text_view_doctor);

        imageView.setImageURI(Utils.imgVar);

        float[] arr = getIntent().getExtras().getFloatArray("arr");

        max_ind = 0;
        String str = "\n" + arr[0];

        for (int i=1; i<7; i++) {
            if (arr[i]>arr[max_ind]) {
                max_ind = i;
                str += "\n" + arr[i];
            }
        }

        Toast.makeText(getApplication(), "" + arr[max_ind] * 100 , Toast.LENGTH_SHORT).show();

        textViewHeading = findViewById(R.id.text_view_heading);

        textViewHeading.setText(Utils.hashMap.get(max_ind));

        progressBar.setProgress((int) (arr[max_ind] * 100));

        int progress = (int) (arr[max_ind]*100);

        textViewPercent.setText(String.valueOf(progress + "%"));
        
        title = "" + Utils.hashMap.get(max_ind);
        message = "" + Utils.hashMapInfo.get(max_ind);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(ResultActivity.this)
                .setTitle(title)
                .setMessage(message)
                .setNeutralButton("OK", null);

        buttonReadMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.show();
            }
        });

        textViewDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DoctorActivity.class);
                startActivity(intent);
            }
        });

    }
}