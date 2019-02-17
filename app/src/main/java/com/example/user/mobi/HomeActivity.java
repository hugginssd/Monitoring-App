package com.example.user.mobi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button btn_start_tour;
    Button btn_sos;
    Button btn_mms;
    Button btn_incident;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn_start_tour = (Button)findViewById(R.id.btn_start_tour);
        btn_sos = findViewById(R.id.btn_sos);
        btn_mms = findViewById(R.id.btn_mme);
        btn_incident = findViewById(R.id.btn_incident);
        btn_start_tour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });
        btn_sos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,SOSActivity.class);
                startActivity(intent);
            }
        });
        btn_mms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,MultimediaActivity.class);
                startActivity(intent);
            }
        });
        btn_incident.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,IncidentsActivity.class);
                startActivity(intent);
            }
        });
    }
}
