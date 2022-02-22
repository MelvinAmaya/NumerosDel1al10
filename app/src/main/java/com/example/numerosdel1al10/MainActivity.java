package com.example.numerosdel1al10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button numeros;
    int contador;

    @Override
    public void onBackPressed() {
        if(contador ==0)
        {
            Toast.makeText(getApplicationContext(),"Presione de Nuevo Para salir.",Toast.LENGTH_LONG).show();
            contador++;
        }
        else
        {
            super.onBackPressed();
        }

        new CountDownTimer(5000,1000){

            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                contador =0;

            }
        }.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numeros = (Button) findViewById(R.id.btnnum);
        numeros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity_Numero.class);
                startActivity(i);
            }
        });
    }
}