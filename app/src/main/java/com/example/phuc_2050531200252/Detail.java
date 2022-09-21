package com.example.phuc_2050531200252;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtDetail = (TextView) findViewById(R.id.textViewCauThu);
        Intent intent = getIntent();
        String noiDung = intent.getStringExtra("cauthu");
        txtDetail.setText(noiDung);


    }
}