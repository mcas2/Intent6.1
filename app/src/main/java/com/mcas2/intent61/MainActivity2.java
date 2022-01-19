package com.mcas2.intent61;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText etDecenas;
    String decenas;
    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        datos = getIntent().getExtras();
    }

    public void openThird(View view) {
        etDecenas = findViewById(R.id.etDecenas);
        decenas = etDecenas.getText().toString();

        Intent myIntent2 = new Intent(this, MainActivity3.class);
        myIntent2.putExtra("Decenas", decenas);
        myIntent2.putExtra("Centenas", datos.getString("Centenas"));
        startActivity(myIntent2);
    }
}