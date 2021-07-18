package com.example.tarea03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tarea03.Usuario.ActivityRegistroUsuario;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar (View view ){
    Intent enviar = new Intent(this, MainActivityPrincipal.class);
    startActivity(enviar);

    }


    public void reguistrarusuario (View view ){
        Intent reguistrarusuario = new Intent(this, ActivityRegistroUsuario.class);
        startActivity(reguistrarusuario);

    }



}