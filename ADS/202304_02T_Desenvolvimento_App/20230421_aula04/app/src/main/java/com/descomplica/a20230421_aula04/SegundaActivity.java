package com.descomplica.a20230421_aula04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intentRecebida = getIntent();
        String nome = intentRecebida.getStringExtra(MainActivity.NOME);

        TextView tvMensageRecebida = findViewById(R.id.mensagemRecebida);
        tvMensageRecebida.setText("Olá " + nome);


    }
}