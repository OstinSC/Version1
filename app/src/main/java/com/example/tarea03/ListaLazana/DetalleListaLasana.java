package com.example.tarea03.ListaLazana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tarea03.R;

public class DetalleListaLasana extends AppCompatActivity {
    private TextView tvTitulo, tvDescripcion;
    private ImageView imgFoto;
    private EntidadLa item;
    private CheckBox CheckLasana;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_lista_lasana);

        item = (EntidadLa)getIntent().getSerializableExtra("item");
        if (item != null){
            tvTitulo = findViewById(R.id.tvTitulo);
            tvDescripcion = findViewById(R.id.tvDescripcion);
            imgFoto = findViewById(R.id.imgFoto);
            CheckLasana = findViewById(R.id.CheckLasana);

            tvTitulo.setText(item.getTitulo());
            tvDescripcion.setText(item.getContenido());
            imgFoto.setImageResource(item.getImgFoto());

        }
    }
}
