package com.example.barishaldivision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import com.example.barishaldivision.FindHospital;
import com.example.barishaldivision.R;

public class MainActivity extends AppCompatActivity {
    ScrollView sv;
    Button d1,d2,d3,d4,d5,d6,d7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sv = findViewById(R.id.scrl);
        sv.setVisibility(View.VISIBLE);
        d1 =(Button) findViewById(R.id.Bshal1);
        d2=(Button) findViewById(R.id.Bshal2);
        d3=(Button) findViewById(R.id.Bshal3);
        d4=(Button) findViewById(R.id.Bshal4);
        d5=(Button) findViewById(R.id.Bshal5);
        d6=(Button) findViewById(R.id.Bshal6);
        d7=(Button) findViewById(R.id.Bshal7);
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), FindHospital.class));
            }
        });
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FindHospital.class));
            }
        });
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FindHospital.class));
            }
        });
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FindHospital.class));
            }
        });
        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FindHospital.class));
            }
        });
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FindHospital.class));
            }
        });
        d7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FindHospital.class));
            }
        });

    }
}