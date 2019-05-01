package com.example.sholatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView Tahajud, Witir, Rawatir, Dhuha, Istikhoroh, Tayyatul_masjid, Syuruq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tahajud = findViewById(R.id.Tahajud);
        Witir = findViewById(R.id.Witir);
        Rawatir = findViewById(R.id.Rawatir);
        Dhuha = findViewById(R.id.Dhuha);
        Istikhoroh = findViewById(R.id.Istikhoroh);
        Tayyatul_masjid = findViewById(R.id.Tayyatul_masjid);
        Syuruq = findViewById(R.id.Syuruq);

        Tahajud.setOnClickListener(this);
        Witir.setOnClickListener(this);
        Rawatir.setOnClickListener(this);
        Dhuha.setOnClickListener(this);
        Istikhoroh.setOnClickListener(this);
        Tayyatul_masjid.setOnClickListener(this);
        Syuruq.setOnClickListener(this);


       }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.Tahajud:
                Intent Tahajud = new Intent(MainActivity.this, Deskripsi.class);
                Tahajud.putExtra("sunnah", "https://www.wisatanabawi.com/shalat-tahajud/");

            case R.id.Witir:
                Intent Witir = new Intent(MainActivity.this, Deskripsi.class);
                Witir.putExtra("sunnah", "https://www.wisatanabawi.com/shalat-tahajud/");

            case R.id.Rawatir:
                Intent Rawatir = new Intent(MainActivity.this, Deskripsi.class);
                Rawatir.putExtra("sunnah", "https://www.wisatanabawi.com/shalat-tahajud/");

            case R.id.Dhuha:
                Intent Dhuha = new Intent(MainActivity.this, Deskripsi.class);
                Dhuha.putExtra("sunnah", "https://www.wisatanabawi.com/shalat-tahajud/");

            case R.id.Istikhoroh:
                Intent Istikhoroh = new Intent(MainActivity.this, Deskripsi.class);
                Istikhoroh.putExtra("sunnah", "https://www.wisatanabawi.com/shalat-tahajud/");

            case R.id.Tayyatul_masjid:
                Intent Tayyatul_masjid = new Intent(MainActivity.this, Deskripsi.class);
                Tayyatul_masjid.putExtra("sunnah", "https://www.wisatanabawi.com/shalat-tahajud/");
    }
}
}
