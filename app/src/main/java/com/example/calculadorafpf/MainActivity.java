package com.example.calculadorafpf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Fib;
    Button Pri;
    Button Fat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fib = findViewById(R.id.Fib);
        Pri = findViewById(R.id.Pri);
        Fat = findViewById(R.id.Fat);

        Fib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaFibo  = new Intent(getApplicationContext(), Fibonnaci.class);
                startActivity(telaFibo);
            }
        });

        Pri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPri = new Intent(getApplicationContext(), Primo.class);
                startActivity(telaPri);
            }
        });

        Fat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaFat = new Intent(getApplicationContext(), Fatorial.class);
                startActivity(telaFat);
            }
        });


    }


}