package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HelloActivity extends AppCompatActivity implements View.OnClickListener {
    private int i;
    private String metodo = "Hola";
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        texto = (TextView) findViewById(R.id.textoEvento);
        //Definir escuchador de evento
        /*texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast1 = Toast.makeText(HelloActivity.this,"Has hecho click con escuchador de eventos", Toast.LENGTH_LONG);
                toast1.show();
            }
        }); */

        /*
        La diferencia entre las 2 opciones es, que, si hay varios elementos sobre los que hacer click,
        en la segunda forma puedes hacer referencia a cada uno de ellos con el this y en el método
        OnClick hacer una referencia con un if a cada uno de ellos e indicar que quieres mostrar.
         */

        //Otra forma de hacer el método anterior
        texto.setOnClickListener(this);
        /*Seleccionar que la clase implemente la interfaz onClickListener,
        * y al hacerlo nos obliga a crear el método OnClick, que ya no aparece aquí adentro, sino,
        * en un método a nivel de la clase.
         */


        //Log.i --> Imprime un mensaje de información en el log
        Log.i("TAG cicloVida ", "Ciclovida: onCreate");
        metodo = "onCreate";
        i=0;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG cicloVida ", "Ciclovida: onStart");
        metodo = "onStart";
        i++;
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG cicloVida ", "Ciclovida: onResume");
        i++;
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG cicloVida ", "Ciclovida: onPause");
        i++;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG cicloVida ", "Ciclovida: onStop");
        i--;
    }

    public void initSecActivity(View view) {
        /*mensaje emergente que aparece en la pantalla del usuario y desaparece tras unos segundos
        *El primer parámetro define el contexto en el que estamos lanzado el mensaje, en este caso
        *hace referencia a HelloActivity
        *El segundo parametro muestra un mensaje
        * El tercer parámetro admite una constante que pueden ser Toast.LENGTH_SHORT que define
        * los segundo que va a estar en pantalla (como 3) o si queremos que dure un poco más poner
        * Toast.LENGTH_LONG, después llamar al método .show para que se muestre el mensaje en pantalla.
         */
        Toast toast1 = Toast.makeText(this,"Has hecho click en el texto", Toast.LENGTH_LONG);
        toast1.show();

    }

    @Override
    public void onClick(View v) {
        int id = v.getId(); //Obtener el id sobre el objeto vista que se ha hecho click

        if(id == R.id.textoEvento){
            Toast toast1 = Toast.makeText(HelloActivity.this,"Has hecho click con escuchador de eventos", Toast.LENGTH_LONG);
            toast1.show();
        }else{
            //...
        }

    }
}
