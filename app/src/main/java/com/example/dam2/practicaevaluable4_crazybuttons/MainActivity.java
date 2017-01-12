package com.example.dam2.practicaevaluable4_crazybuttons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener , DialogoInstrucciones.OnFragmentoDialogoListener{

    private ImageView titulo;
    private ImageButton empezar;
    private ImageButton instrucciones;
    private String parametro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titulo = (ImageView)findViewById(R.id.titulo);
        empezar = (ImageButton)findViewById(R.id.empezar);
        instrucciones = (ImageButton)findViewById(R.id.instrucciones);

        empezar.setOnClickListener(this);
        instrucciones.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.empezar){

            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);

        }
        else if(view.getId()==R.id.instrucciones){
            //Creo un nuevo fragmento diálogo pásandole el alumno
            DialogoInstrucciones dialogo = DialogoInstrucciones.newInstance(parametro);
            //Me suscribo a los eventos del fragmento
            dialogo.setOnFragmentoDialogoListener(this);
            //Muestro el fragmento diálogo
           dialogo.show(getFragmentManager(), null);
        }
    }
}
