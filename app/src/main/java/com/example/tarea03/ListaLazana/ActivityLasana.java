package com.example.tarea03.ListaLazana;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.tarea03.R;
import java.util.ArrayList;

public class ActivityLasana extends AppCompatActivity {
    private ListView lvItems;
    private AdaptadorLa adaptadorLa;
    private ArrayList<EntidadLa> arrayEntidadLa = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lasana);

        lvItems = (ListView) findViewById(R.id.lvItemslazana);
        llenarItems();
    }
    private void llenarItems(){
        arrayEntidadLa.add(new EntidadLa(R.drawable.lasagnabolognesa,"Lasaña Boloñesa","Esta Lasaña es con carne de perro y gato :v"));

        adaptadorLa = new AdaptadorLa(this, arrayEntidadLa);
        lvItems.setAdapter(adaptadorLa);
    }
}