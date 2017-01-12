package com.example.dam2.practicaevaluable4_crazybuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    //Creamos los objetos que necesitaremos en la actividad
    private Button boton1, boton2,boton3,boton4;
    private TextView usuario,fases,porcentaje;
    private ProgressBar barra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //Instanciamos tanto los text view, como los botons y la barra de progreso.
        usuario = (TextView) findViewById(R.id.nombreUsuario);
        fases = (TextView) findViewById(R.id.faseJuego);
        porcentaje = (TextView)findViewById(R.id.porcentajeBarra);

        boton1 = (Button) findViewById(R.id.boton1);
        boton2 = (Button) findViewById(R.id.boton2);
        boton3 = (Button) findViewById(R.id.boton3);
        boton4 = (Button) findViewById(R.id.boton4);

        barra = (ProgressBar) findViewById(R.id.barraProgreso);

        //Nos suscribimos a los diferentes botones

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
