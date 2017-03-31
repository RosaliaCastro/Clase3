package com.example.alumno.clase3;

import android.widget.Button;
import android.widget.TextView;

/**
 * Created by alumno on 30/03/2017.
 */

public class Controlador  {

    public TextView texto;
    public Button btn;
    MyListener listener;
    Vista myVista;
    Controlador(){}
    Controlador (MyListener listener){
        this.listener=listener;
        this.myVista= null;
    }
    public MyListener getListener(){return this.listener;}



}
