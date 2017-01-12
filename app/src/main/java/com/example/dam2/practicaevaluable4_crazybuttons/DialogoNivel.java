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

public class DialogoNivel extends DialogFragment implements DialogInterface.OnClickListener {
  /*  private Alumno alumno;
    private OnFragmentoDialogoListener escuchador;

    //Constructor newInstance para poder pasarle el alumno
    public static FragmentoDialogo newInstance(Alumno alumno) {
        FragmentoDialogo fragment = new FragmentoDialogo();
        fragment.alumno = alumno;
        return fragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        //Construyo y devuelvo el diálogo
        //Primero genero un constructor de diálogos de alerta
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("¿Qué quieres hacer con " + alumno.getNombre() + "?");
        builder.setTitle("Ojito");
        //Configuro el botón "Decrementar Edad"
        builder.setPositiveButton(R.string.string_boton_positivo, this);
        //Configuro el botón "Eliminar alumno"
        builder.setNeutralButton(R.string.string_boton_neutral, this);
        //Configuro el botón "Cancelar"
        builder.setNegativeButton(R.string.string_boton_negativo, this);
        //Devuelvo el AlertDialog ya configurado
        return builder.create();
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        if (which == DialogInterface.BUTTON_POSITIVE){
            //Si existe una actividad suscrita, llamo a su método relacionado con mi evento
            if (escuchador != null){
                escuchador.onRestarEdad(alumno);
            }
        }
        else if (which == DialogInterface.BUTTON_NEUTRAL){
            //Si existe una actividad suscrita, llamo a su método relacionado con mi evento
            if (escuchador != null){
                escuchador.onEliminarAlumno(alumno);
            }
        }
        else if (which == DialogInterface.BUTTON_NEGATIVE){
            Toast.makeText(getActivity(), "La acción fue cancelada", Toast.LENGTH_SHORT).show();
        }
    }

    //Interfaz que permitirá que se nos suscriban a nuestros eventos
    public interface OnFragmentoDialogoListener {
        void onRestarEdad(Alumno alumno);
        void onEliminarAlumno(Alumno alumno);
    }

    //Método con el cual las actividades se nos suscribirán a nuestros eventos
    public void setOnFragmentoDialogoListener (OnFragmentoDialogoListener escuchador) {
        this.escuchador = escuchador;
    }*/

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {

    }
}
