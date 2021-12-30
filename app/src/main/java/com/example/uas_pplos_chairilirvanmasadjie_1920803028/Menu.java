package com.example.uas_pplos_chairilirvanmasadjie_1920803028;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


    }

    public void motor(View view) {
        Intent motorr = new Intent(Menu.this,listmotor.class);
        startActivity(motorr);
    }

    public void ext(View view) {
        finish();

    }

    public void tambah(View view) {
        Intent tmbh = new Intent(Menu.this,tambahkanmotor.class);
        startActivity(tmbh);
    }

    public void info(View view) {
        Intent ig = new Intent (Menu.this,info.class);
        startActivity(ig);
    }
}