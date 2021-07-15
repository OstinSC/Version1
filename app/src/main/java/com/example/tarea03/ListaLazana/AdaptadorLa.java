package com.example.tarea03.ListaLazana;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tarea03.R;


public class AdaptadorLa extends BaseAdapter {
    private ArrayList<EntidadLa> listEntidadLa;
    private Context context;
    private LayoutInflater inflater;

    public AdaptadorLa(Context context, ArrayList<EntidadLa> listEntidadLa) {
        this.context = context;
        this.listEntidadLa = listEntidadLa;
    }

    @Override
    public int getCount() {
        return listEntidadLa.size();
    }

    @Override
    public Object getItem(int position) {
        return listEntidadLa.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // OBTENER EL OBJETO POR CADA ITEM A MOSTRAR
        final EntidadLa entidadLa = (EntidadLa) getItem(position);

        // CREAMOS E INICIALIZAMOS LOS ELEMENTOS DEL ITEM DE LA LISTA
        convertView = LayoutInflater.from(context).inflate(R.layout.itemlazana, null);
        ImageView imgFoto = (ImageView) convertView.findViewById(R.id.imgFoto);
        TextView tvTitulo = (TextView) convertView.findViewById(R.id.tvTitulo);
        TextView tvContenido = (TextView) convertView.findViewById(R.id.tvContenido);

        // LLENAMOS LOS ELEMENTOS CON LOS VALORES DE CADA ITEM
        imgFoto.setImageResource(entidadLa.getImgFoto());
        tvTitulo.setText(entidadLa.getTitulo());
        tvContenido.setText(entidadLa.getContenido());



        convertView.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetalleListaLasana.class);
                i.putExtra("item",  entidadLa);

                context.startActivity(i);
                System.out.println("Click !!");
            }
        });

        return convertView;
    }


}