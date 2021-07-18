package com.example.tarea03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tarea03.ListaBebidas.ActivityBebidas;
import com.example.tarea03.ListaLazana.ActivityLasana;

import com.example.tarea03.ListaPizza.ActivityPizza;

public class MainActivityPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_principal);
    }

    public void listalasana (View view ){
        Intent listalasana = new Intent(this, ActivityLasana.class);
        startActivity(listalasana);}

    public void listapizza (View view ){
        Intent listapizza = new Intent(this, ActivityPizza.class);
        startActivity(listapizza);}



    public void listabebidas (View view ){
        Intent listabebidas = new Intent(this, ActivityBebidas.class);
        startActivity(listabebidas);}


}


