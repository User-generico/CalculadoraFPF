package com.example.calculadorafpf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class Fatorial extends AppCompatActivity {

    Button voltar;
    Button enter1;
    TextView resultado1;
    EditText numero1;
    Stack<Integer> pilha = new Stack<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatorial);

        voltar = findViewById(R.id.voltar);
        enter1 = (Button) findViewById(R.id.enter1);
        resultado1 = (TextView) findViewById(R.id.resultado1);
        numero1 = (EditText) findViewById(R.id.inputnumero1);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void mostrar1() {
        resultado1.setText(pilha.toString());
    }

    public void insercao1(View ins){
        pilha.clear();
        int x = Integer.parseInt(String.valueOf(numero1.getText()));
        int aux = 1;
        for (int i = x; i > 0; i--){
            aux = i * aux;
        }
        pilha.push(aux);
        mostrar1();
    }
}