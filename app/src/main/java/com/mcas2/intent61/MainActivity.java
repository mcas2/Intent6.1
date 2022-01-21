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

public class MainActivity extends AppCompatActivity {
    EditText etCentenas;
    String centenas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openSecond (View view) {
        etCentenas = findViewById(R.id.etCentenas);
        centenas = etCentenas.getText().toString();

        Intent myIntent = new Intent(this, MainActivity2.class);
        myIntent.putExtra("Centenas", centenas);
        startActivity(myIntent);
    }
}