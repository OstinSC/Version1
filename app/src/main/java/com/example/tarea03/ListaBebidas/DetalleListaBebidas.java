package com.example.tarea03.ListaBebidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.tarea03.R;


public class DetalleListaBebidas extends AppCompatActivity {

    private TextView tvTitulo, tvDescripcion;
    private ImageView imgFoto;
    private EntidadBe item;
    private CheckBox CheckBebidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_lista_bebidas);

        item = (EntidadBe)getIntent().getSerializableExtra("item");
        if (item != null){
            tvTitulo = findViewById(R.id.tvTitulo2);
            tvDescripcion = findViewById(R.id.tvDescripcion2);
            imgFoto = findViewById(R.id.imgFoto2);
            CheckBebidas = findViewById(R.id.CheckBebidas);

            tvTitulo.setText(item.getTitulo2());
            tvDescripcion.setText(item.getContenido2());
            imgFoto.setImageResource(item.getImgFoto2());

        }
    }
}