package com.example.tarea03.ListaPizza;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tarea03.R;
import java.util.ArrayList;


public class ActivityPizza extends AppCompatActivity {
    private ListView lvItems;
    private AdaptadorPi adaptadorPi;
    private ArrayList<EntidadPi> arrayEntidadPi = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        lvItems = (ListView) findViewById(R.id.lvItemspizza);
        llenarItems();
    }

    private void llenarItems(){
        arrayEntidadPi.add (new EntidadPi(R.drawable.pizzaformaggi, "Pizza Formaggi","Tienes que ser un verdadero amante del queso para apreciar esta cremosa, deliciosa y atractiva pizza blanca. "));
        arrayEntidadPi.add (new EntidadPi(R.drawable.pizzamargherita, "Pizza Margharita","Ya sea en su simple versión con mozzarella fiordilatte o mozzarella de bufala (en este caso se llamará BUFALINA)"));
        arrayEntidadPi.add (new EntidadPi(R.drawable.pizzamarinara, "Pizza Mariana","Los ingredientes de cada pizzería: tomate, ajo, orégano y aceite (a veces incluso albahaca)"));
        arrayEntidadPi.add (new EntidadPi(R.drawable.pizzaprosciutto, "Pizza Prosciutto","Se puede pedir en dos versiones diferentes: con jamón cocido (al horno) o con jamón crudo (puesto después de la cocción)"));
        arrayEntidadPi.add (new EntidadPi(R.drawable.pizzastagioni, "Pizza Stagioni","Una mezcla de sabores fuertes juntos a mozzarella y tomate"));
        arrayEntidadPi.add (new EntidadPi(R.drawable.pizzacapricciosa, "Pizza Capricciosa","Muy similar a la Quattro Stagioni es la pizza Capricciosa"));


        adaptadorPi = new AdaptadorPi(this, arrayEntidadPi);
        lvItems.setAdapter(adaptadorPi);

    }
}