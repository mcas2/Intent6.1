package com.mcas2.intent61;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Mostrar extends AppCompatActivity {
    Bundle datos;
    String centenas, decenas, unidades;
    TextView showNumber;
    TextView showBinaryNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);
        showNumber = findViewById(R.id.showNumber);
        showBinaryNumber = findViewById(R.id.showBinaryNumber);

        datos = getIntent().getExtras();
        centenas = datos.getString("Centenas");
        decenas = datos.getString("Decenas");
        unidades = datos.getString("Unidades");

        String numero = centenas+decenas+unidades;
        int numeroFinal = Integer.parseInt(numero);
        String numeroBinario = Integer.toBinaryString(numeroFinal);

        showNumber.setText(numero);
        showBinaryNumber.setText(numeroBinario);
    }
}