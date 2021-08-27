package com.example.calculadorafpf;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class Fibonnaci extends AppCompatActivity {

    Button voltar;
    Button enter3;
    TextView resultado3;
    EditText numero3;
    Stack<Integer> pilha3 = new Stack<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonnaci);

        voltar = findViewById(R.id.voltar);
        enter3 = (Button) findViewById(R.id.enter3);
        resultado3 = (TextView) findViewById(R.id.resultado3);
        numero3 = (EditText) findViewById(R.id.inputnumero3);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    @SuppressWarnings("SpellCheckingInspection")
    public void mostrar3() {
        resultado3.setText(pilha3.toString());
    }

    @SuppressWarnings("SpellCheckingInspection")
    @SuppressLint("SetTextI18n")
    public void insercao3(View v){
        pilha3.clear();
        int x = Integer.parseInt(String.valueOf(numero3.getText()));
        int a = 0;
        int b = 1;
        int c = 0;
        if (x == 1){
            pilha3.push(a);
            mostrar3();
        }else if (x > 1){
            pilha3.push(a);
            pilha3.push(b);
            for (int i = 0; i <= x - 3; i++){
                c = a + b;
                a = b;
                b = c;
                pilha3.push(c);
            }
            mostrar3();
        }
        else{
            resultado3.setText("Não pode 0 ou número negativo >:(");
        }
    }
}