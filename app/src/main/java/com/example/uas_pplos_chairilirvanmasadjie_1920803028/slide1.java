package com.example.uas_pplos_chairilirvanmasadjie_1920803028;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class slide1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide1);
    }

    public void lanjut(View view) {
        Intent lanjut = new Intent(slide1.this, slide2.class);
        startActivity(lanjut);
    }

    public void lewati(View view) {
        Intent lewat = new Intent(slide1.this, Menu.class);
        startActivity(lewat);
    }
}