package com.example.a202303_aula0102;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvMsg = findViewById(R.id.mensagem);
        tvMsg.setText("Ola Faculdade Descomplica!");
        tvMsg.setText("Ola Faculdade Descomplica!");

    }
}