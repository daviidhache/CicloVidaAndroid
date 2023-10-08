package com.example.ciclovida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CalendarActivity extends AppCompatActivity {

    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        texto  = findViewById(R.id.textView1);
        // Permite recuperar los valores.
        Bundle extra = getIntent().getExtras();
        // Declaramos variable para almacenar el intent
        int valor = extra.getInt("Numero");
        // Como argumento, le entra el nombre asignado en el intent.

    }
}