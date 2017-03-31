package com.example.alumno.clase3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Modelo myModelo = new Modelo("hola");
        Vista myVista = new Vista(this,myModelo);
        Controlador myControlador = new Controlador(new MyListener(myVista));

    }



}
