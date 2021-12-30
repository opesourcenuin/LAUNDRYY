package com.example.uas_pplos_chairilirvanmasadjie_1920803028;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class getstarted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getstarted);
    }

    public void get(View view) {
        Intent get = new Intent(getstarted.this,slide1.class);
        startActivity(get);
    }
}