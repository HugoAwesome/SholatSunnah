package com.example.sholatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Deskripsi extends AppCompatActivity {

    WebView WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        //inialisasi

        WebView = findViewById(R.id.WebView);

        Intent deskripsi = getIntent();

        String link = deskripsi.getStringExtra("sunnah");

        //agar javascriptnya bisa terbaca
        WebView.getSettings().setJavaScriptEnabled(true);
        //agar gambarnya automatis dimasukkan
        WebView.getSettings().setLoadsImagesAutomatically(true);
        //untuk masukkan link nya
        WebView.loadUrl(link);
    }
}
