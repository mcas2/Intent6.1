package com.mcas2.intent61;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    EditText etUnidades;
    String unidades;
    Bundle datos2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        datos2 = getIntent().getExtras();

    }

    public void openShow (View view) {
        etUnidades = findViewById(R.id.etUnidades);
        unidades = etUnidades.getText().toString();

        Intent myIntent3 = new Intent(this, Mostrar.class);
        myIntent3.putExtra("Unidades", unidades);
        myIntent3.putExtra("Decenas", datos2.getString("Decenas"));
        myIntent3.putExtra("Centenas", datos2.getString("Centenas"));
        startActivity(myIntent3);
    }
}