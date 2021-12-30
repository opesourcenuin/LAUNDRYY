package com.example.uas_pplos_chairilirvanmasadjie_1920803028;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class slide2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide2);
    }

    public void lanjut(View view) {
        Intent ljt = new Intent(slide2.this, slide3.class);
        startActivity(ljt);
    }
}