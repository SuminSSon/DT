package com.chobo.practice;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;


public class activity_start1 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start1);

        Button btn_notification = (Button) findViewById(R.id.btn_notification);

        Button btn_all = (Button) findViewById(R.id.btn_all);
        Button btn_claim = (Button) findViewById(R.id.btn_claim);

        btn_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), activity_notification.class);
                startActivity(intent);
            }
        });



        btn_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getintent = getIntent();
                int getStationId = getintent.getIntExtra("stationId",0);
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("stationId",getStationId);
                startActivity(intent);
            }
        });

        btn_claim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), activity_claim_login.class);

                startActivity(intent);
            }
        });

    }



}