package com.descomplica.a20230421_aula04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //Etiqueta para posterior chamada mais facilitada
    public static final String NOME = "com.descomplica.a20230421_aula04.NOME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Método que será evocado pelo botão da activity_main para chamar uma outra atividade via classe Intent
    public void navegar(View view){
        Intent intent = new Intent(this, SegundaActivity.class);
        
        String nome = "Marcus";
        intent.putExtra(NOME, nome);
        
        startActivity(intent);
    }

}