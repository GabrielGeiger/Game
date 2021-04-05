package com.cristina.meujogovelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //declaração dos atributos que serão manipulados
    Button btnComo, btnJogar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mapeamento dos objetos que serão manipulados
        btnComo = findViewById(R.id.btnComo);
        btnJogar = findViewById(R.id.btnJogar);

        /*configuração do ouvidor (listener) para o evento OnClick
        com os métodos para abrir a activity ComoJogar e Jogo
         */
        btnComo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirComo();

            }
        });

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirGame();

            }
        });
    }

    //criação dos métodos para abertura das Activities usando Intent e startActivity

    private void abrirComo() {
        Intent janela = new Intent(this, com.cristina.meujogovelha.QuebraCabeca.class);
        startActivity(janela);
    }

    private void abrirGame() {
        Intent janelag = new Intent(this, Jogo.class);
        startActivity(janelag);
    }
}