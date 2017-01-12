package com.example.dam2.practicaevaluable4_crazybuttons;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by jghg1 on 11/01/2017.
 */

public class DialogoInstrucciones extends DialogFragment implements DialogInterface.OnClickListener {

    private String instrucciones;
    private OnFragmentoDialogoListener escuchador;

    //Creamos un constructor para meter el objeto string que hemos creado
    public static DialogoInstrucciones newInstance(String instrucciones){
        DialogoInstrucciones dialogo = new DialogoInstrucciones();
        dialogo.instrucciones=instrucciones;
        return dialogo;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        //Construyo y devuelvo el diálogo
        //Primero genero un constructor de diálogos de alerta
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Este juego consiste ...");
        builder.setTitle("Instrucciones");
        //Configuro el botón "Decrementar Edad"
        builder.setPositiveButton("Aceptar", null);

        return builder.create();
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        if (which == DialogInterface.BUTTON_POSITIVE){

        }
    }
    //Interfaz que permitirá que se nos suscriban a nuestros eventos
    public interface OnFragmentoDialogoListener {
    }

    //Método con el cual las actividades se nos suscribirán a nuestros eventos
    public void setOnFragmentoDialogoListener (OnFragmentoDialogoListener escuchador) {
        this.escuchador = escuchador;
    }

}
