package com.example.tarea03.ListaBebidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.tarea03.ListaPizza.AdaptadorPi;
import com.example.tarea03.ListaPizza.EntidadPi;
import com.example.tarea03.R;

import java.util.ArrayList;

public class ActivityBebidas extends AppCompatActivity {

    private ListView lvItems;
    private AdaptadorBe adaptadorBe;
    private ArrayList<EntidadBe> arrayEntidadBe = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);

        lvItems = (ListView) findViewById(R.id.lvItemsbebidas);
        llenarItems();
    }

    private void llenarItems(){
        arrayEntidadBe.add (new EntidadBe(R.drawable.bebidascosmopolitan, "Cosmopolitan","Una mezcla de vodka, triple sec, zumo de limón y zumo de arándanos"));
        arrayEntidadBe.add (new EntidadBe(R.drawable.bebidaspiscosour, "Cosmopolitan","Legado gastronómico del Perú que deriva del puerto pisco situado al sur del país"));
        arrayEntidadBe.add (new EntidadBe(R.drawable.bebidasmaitai, "Cosmopolitan","Es a base de ron blanco y negro, sirope de horchata, zumo de limón y curacao de naranja."));
        arrayEntidadBe.add (new EntidadBe(R.drawable.bebidasmanhattan, "Cosmopolitan","Sus bases son el vermouth rojo y el whisky y en algunos casos cuenta con toques de bitter de angostura"));
        arrayEntidadBe.add (new EntidadBe(R.drawable.bebidasdaiquiri, "Cosmopolitan","Se usa ron blanco, azúcar y zumo de limón o lima"));
        arrayEntidadBe.add (new EntidadBe(R.drawable.bebidasmargarita, "Cosmopolitan","En sus bases el uso del tequila blanco, Cointreau y el jugo de limón fresco."));
        arrayEntidadBe.add (new EntidadBe(R.drawable.bebidasmojito, "Cosmopolitan","Una bebida tropical que está dentro de los clásicos en un bar nupcial y de todo tipo de evento"));
        arrayEntidadBe.add (new EntidadBe(R.drawable.bebidaswhiskysour, "Cosmopolitan","A base bourbon, azúcar y jugo de limón y en algunos casos clara de huevo muestra una composición divertida con una esencia que no decepciona"));


        adaptadorBe = new AdaptadorBe(this, arrayEntidadBe);
        lvItems.setAdapter(adaptadorBe);

    }
}