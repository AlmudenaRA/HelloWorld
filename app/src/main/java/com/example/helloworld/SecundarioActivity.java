package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecundarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Carga en la pantalla del dispositivo el layout que queremos mostrar en este activity
        //Referencia con el fichero xml que define el layout (Dentro del directorio res --> layout
        //R = fichero generado automáticamente por android que guarda todos los recursos del proyecto
        setContentView(R.layout.activity_secundario);

    }
}
