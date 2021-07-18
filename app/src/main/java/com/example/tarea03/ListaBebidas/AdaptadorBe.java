package com.example.tarea03.ListaBebidas;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tarea03.ListaLazana.DetalleListaLasana;
import com.example.tarea03.ListaLazana.EntidadLa;
import com.example.tarea03.R;

import java.util.ArrayList;

public class AdaptadorBe extends BaseAdapter {
    private ArrayList<EntidadBe> listEntidadBe;
    private Context context;
    private LayoutInflater inflater;

    public AdaptadorBe(Context context, ArrayList<EntidadBe> listEntidadBe) {
        this.context = context;
        this.listEntidadBe = listEntidadBe;
    }


    @Override
    public int getCount() {
        return listEntidadBe.size();
    }

    @Override
    public Object getItem(int position) {
        return listEntidadBe.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }






    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // OBTENER EL OBJETO POR CADA ITEM A MOSTRAR
        final EntidadBe entidadBe = (EntidadBe) getItem(position);

        // CREAMOS E INICIALIZAMOS LOS ELEMENTOS DEL ITEM DE LA LISTA
        convertView = LayoutInflater.from(context).inflate(R.layout.itembebidas, null);
        ImageView imgFoto = (ImageView) convertView.findViewById(R.id.imgFoto2);
        TextView tvTitulo = (TextView) convertView.findViewById(R.id.tvTitulo2);
        TextView tvContenido = (TextView) convertView.findViewById(R.id.tvContenido2);
        CheckBox CheckLasana = (CheckBox) convertView.findViewById(R.id.CheckBebidas);

        // LLENAMOS LOS ELEMENTOS CON LOS VALORES DE CADA ITEM
        imgFoto.setImageResource(entidadBe.getImgFoto2());
        tvTitulo.setText(entidadBe.getTitulo2());
        tvContenido.setText(entidadBe.getContenido2());


        convertView.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetalleListaBebidas.class);
                i.putExtra("item",  entidadBe);

                context.startActivity(i);
                System.out.println("Click !!");
            }
        });

        return convertView;
    }


}