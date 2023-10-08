package com.example.ciclovida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = findViewById(R.id.texto1);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG ciclo","Hemos pasado por start");

        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent es un objeto que permite llamar a una actividad
                Intent i = new Intent(getApplicationContext(),CalendarActivity.class);
                // Permite enviar parametros a la actividad llamada.
                i.putExtra("Numero",5);
                // Método que recibe por parámetros un intent.
                startActivity(i);

            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG ciclo","Hemos pasado por pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG ciclo","Hemos vuelto a la actividad");
    }
}