package com.example.tarea03.ListaPizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.tarea03.R;

public class DetalleListaPizza extends AppCompatActivity {
    private TextView tvTitulo, tvDescripcion;
    private ImageView imgFoto;
    private EntidadPi item;
    private CheckBox CheckPizza;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_lista_pizza);

        item = (EntidadPi)getIntent().getSerializableExtra("item");
        if (item != null){
            tvTitulo = findViewById(R.id.tvTitulo1);
            tvDescripcion = findViewById(R.id.tvDescripcion1);
            imgFoto = findViewById(R.id.imgFoto1);
            CheckPizza = findViewById(R.id.CheckPizza);

            tvTitulo.setText(item.getTitulo1());
            tvDescripcion.setText(item.getContenido1());
            imgFoto.setImageResource(item.getImgFoto1());
        }
    }
}
