package com.example.smartparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QueDeseoHacer extends AppCompatActivity {

    Button volver;
    Button next;
    Button parquear1;
    Button salir1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que_deseo_hacer);


        next = (Button)findViewById(R.id.siguiente);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguiente = new Intent(QueDeseoHacer.this, porteria.class);
                startActivity(siguiente);
            }
        });

        //PARA VOLVER
        volver = (Button)findViewById(R.id.atras);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volver = new Intent(QueDeseoHacer.this, IniciarSesion.class);
                startActivity(volver);
            }
        });


        /*//PARA PARQUEAR
        parquear1 = (Button)findViewById(R.id.lateral);

        parquear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parquear1.setBackground(getDrawable(R.drawable.rounded_yellow_button));
            }
        });*/


    }
}
