package com.example.alumno.clase3;

import android.view.View;

import com.example.alumno.clase3.IMostrarInfo;
import com.example.alumno.clase3.MainActivity;

/**
 * Created by alumno on 30/03/2017.
 */

public class MyListener implements View.OnClickListener {

    private IMostrarInfo iMostrarInfo;

    public MyListener(IMostrarInfo iMostrarInfo){
        this.iMostrarInfo = iMostrarInfo;
    }

    @Override
    public void onClick(View v) {
       iMostrarInfo.mostrarInfo();
    }
}
