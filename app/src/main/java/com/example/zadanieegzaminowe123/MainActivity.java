package com.example.zadanieegzaminowe123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int licznik = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView licznikpolubien = findViewById(R.id.licznik_polubien);

        Button przycisk_polub = findViewById(R.id.polub_button);
        przycisk_polub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                licznik++;
                licznikpolubien.setText(licznik + " Polubień");
            }
        });
        Button przycisk_usun = findViewById(R.id.usun_button);
        przycisk_usun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(licznik!=0){
                    licznik--;
                    licznikpolubien.setText(licznik + " Polubień");
                }

            }
        });
    }
}