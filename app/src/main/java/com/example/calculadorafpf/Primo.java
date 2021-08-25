package com.example.calculadorafpf;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Primo extends AppCompatActivity {

    Button voltar;
    Button enter2;
    TextView resultado2;
    EditText numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primo);

        voltar = findViewById(R.id.voltar);
        enter2 = (Button) findViewById(R.id.enter2);
        resultado2 = (TextView) findViewById(R.id.resultado2);
        numero2 = (EditText) findViewById(R.id.inputnumero2);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @SuppressWarnings("SpellCheckingInspection")
    @SuppressLint("SetTextI18n")
    public void insercao2(View v){
        int x = Integer.parseInt(String.valueOf(numero2.getText()));
        boolean a = true;
        for (int i = 2; i < x; i++){
            if (x % i == 0) {
                a = false;
                break;
            }
        }
        if (a){
            resultado2.setText("O NÙMERO É PRIMO");
        } else {
            resultado2.setText("O NÚMERO NÃO É PRIMO");
        }
    }
}