package com.example.tarea03.ListaPizza;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tarea03.R;

import java.util.ArrayList;

public class AdaptadorPi extends BaseAdapter {
    private ArrayList<EntidadPi> listEntidadPi;
    private Context context;
    private LayoutInflater inflater;

    public AdaptadorPi(Context context, ArrayList<EntidadPi> listEntidadPi ){
        this.context = context;
        this.listEntidadPi = listEntidadPi;

    }

    @Override
    public int getCount() {
        return listEntidadPi.size();
    }

    @Override
    public Object getItem(int position) {
        return listEntidadPi.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // OBTENER EL OBJETO POR CADA ITEM A MOSTRAR
        final EntidadPi entidadPi = (EntidadPi) getItem(position);

        // CREAMOS E INICIALIZAMOS LOS ELEMENTOS DEL ITEM DE LA LISTA
        convertView = LayoutInflater.from(context).inflate(R.layout.itempizza, null);
        ImageView imgFoto1 = (ImageView) convertView.findViewById(R.id.imgFoto1);
        TextView tvTitulo1 = (TextView) convertView.findViewById(R.id.tvTitulo1);
        TextView tvContenido1 = (TextView) convertView.findViewById(R.id.tvContenido1);
        CheckBox CheckLasana = (CheckBox) convertView.findViewById(R.id.CheckPizza);

        // LLENAMOS LOS ELEMENTOS CON LOS VALORES DE CADA ITEM
        imgFoto1.setImageResource(entidadPi.getImgFoto1());
        tvTitulo1.setText(entidadPi.getTitulo1());
        tvContenido1.setText(entidadPi.getContenido1());



        convertView.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetalleListaPizza.class);
                i.putExtra("item",  entidadPi);

                context.startActivity(i);
                System.out.println("Click !!");
            }
        });

        return convertView;
    }


}