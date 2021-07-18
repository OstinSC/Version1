package com.example.tarea03.ListaLazana;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.tarea03.R;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class ActivityLasana extends AppCompatActivity {
    private ListView lvItems;
    private AdaptadorLa adaptadorLa;
    private ArrayList<EntidadLa> arrayEntidadLa = new ArrayList<>();
    TextView tvCanProductos;
    Button btnVerCarro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lasana);
        getSupportActionBar().hide();
        tvCanProductos = findViewById(R.id.tvCantProductos);
        btnVerCarro = findViewById(R.id.btnVerCarro);

       lvItems = (ListView) findViewById(R.id.lvItemslazana);


       llenarItems();
    }









    private void llenarItems(){
        arrayEntidadLa.add(new EntidadLa(R.drawable.lasagnabolognesa,"Lasaña Boloñesa","Éste puede ser uno de los platos más típicos de la cocina italiana que, preparamos con ingredientes sin gluten",10));

        arrayEntidadLa.add(new EntidadLa(R.drawable.lasanacarne,"Lasaña de Carne","En este listado no podía faltar la clásica lasaña, pero en una versión saludables que nos ahorrará muchas calorías al estar hecha sin bechamel ni queso",10));
        arrayEntidadLa.add(new EntidadLa(R.drawable.lasanaguacamole,"Lasaña de Guacamole","Ahora os presentamos una lasaña muy original y refrescante, con un aspecto muy atractivo",10));
        arrayEntidadLa.add(new EntidadLa(R.drawable.lasanahigado,"Lasaña de Higado","Además de la pasta, este plato tiene como protagonistas al champiñón y los higaditos de pollo",10));
        arrayEntidadLa.add(new EntidadLa(R.drawable.lasanapollo,"Lasaña de Pollo y Espinacas","Este plato es muy recomendable para ofrecer a los más pequeños de la casa0",10));
        arrayEntidadLa.add(new EntidadLa(R.drawable.lasanasetas,"Lasaña de Setas","Esta lasaña con setas, verduras y atún nos dará como resultado un plato muy completo desde el punto de vista nutricional",10));
        arrayEntidadLa.add(new EntidadLa(R.drawable.lasanasetasesparragos,"Lasaña de Esparragos","Os presentamos ahora una deliciosa lasaña de setas y espárragos verdes",10));
        arrayEntidadLa.add(new EntidadLa(R.drawable.lasanavegetal,"Lasaña Vegetal","Esta lasaña vegetal presenta una fórmula perfecta para que los más pequeños tomen verduras",10));




        adaptadorLa = new AdaptadorLa(this, arrayEntidadLa);
        lvItems.setAdapter(adaptadorLa);
    }
}