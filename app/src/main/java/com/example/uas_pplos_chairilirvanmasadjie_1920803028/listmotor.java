package com.example.uas_pplos_chairilirvanmasadjie_1920803028;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class listmotor extends AppCompatActivity {

    ListView lv;

    int[] iconList = new int[]{
            R.mipmap.sekiloo_foreground, R.mipmap.limooo_foreground, R.mipmap.sepuluhhh_foreground,
            R.mipmap.gosokk_foreground
    };

    String[] Headline = {"1kg", "5kg", "10kg", "Gosok"
    };

    String[] Subhead = {"Rp.5000", "Rp.15000", "Rp.25000", "Rp.5000-10.000"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listmotor);


        lv = findViewById(R.id.iii);
        adaptermotor adaptermotor = new adaptermotor(this, iconList, Headline, Subhead);
        lv.setAdapter(adaptermotor);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), akhir.class);

                    startActivityForResult(intent, 0);
                }

                //Position 1 is Twitter

                if (position == 1) {
                    Intent intent = new Intent(view.getContext(),akhir2.class);


                    startActivityForResult(intent, 0);
                }

                if (position == 2) {
                    Intent intent = new Intent(view.getContext(),akhir3.class);
                    startActivityForResult(intent, 0);
                }

                if (position == 3) {
                    Intent intent = new Intent(view.getContext(), akhir4.class);
                    startActivityForResult(intent, 0);
                }




                //Do the same thing next time

                Toast.makeText(getApplicationContext(),
                        "You have selected : " + Headline[position],
                        Toast.LENGTH_SHORT).show();

            }
        });

    }


    public void ss(View view) {
        Intent ss = new Intent(listmotor.this, Menu.class);
        startActivity(ss);
    }
}
