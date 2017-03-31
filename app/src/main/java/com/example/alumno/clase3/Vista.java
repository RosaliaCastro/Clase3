package com.example.alumno.clase3;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by alumno on 30/03/2017.
 */

public class Vista implements IMostrarInfo {

    public TextView texto;
    public Button btn;
    public MainActivity activity;
    public Controlador myControlador;
    public Modelo myModelo;

    public Vista(MainActivity activity, Modelo myModelo){
        this.activity=activity;
        this.myModelo=myModelo;

        this.texto = (TextView) activity.findViewById(R.id.texto);
        texto.setText(myModelo.getTexto());

        this.btn = (Button) activity.findViewById(R.id.boton1);
        btn.setText("Cambiar texto");

        View.OnClickListener listener = new MyListener((IMostrarInfo)this);
        btn.setOnClickListener(listener);

    }

    @Override
    public void mostrarInfo() {
        texto.setText("TEXTO CAMBIADO");
    }


}
