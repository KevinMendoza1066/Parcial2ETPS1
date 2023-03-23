package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Datos extends AppCompatActivity {
    TextView tvNombre,tvCargo,tvEmpresa;

    ImageView imvEmpleado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        tvNombre = findViewById(R.id.tvNombre2);
        tvCargo = findViewById(R.id.tvPuesto2);
        tvEmpresa = findViewById(R.id.tvCompania2);
        imvEmpleado = findViewById(R.id.imageView2);
        Bundle bundle = getIntent().getExtras();
        String Nombre = bundle.getString("Nombre");
        String Empresa = bundle.getString("Empresa");
        String Cargo = bundle.getString("Puesto");
        int Imagen = bundle.getInt("imagen");
        tvNombre.setText(Nombre);
        tvCargo.setText(Cargo);
        tvEmpresa.setText(Empresa);
        imvEmpleado.setImageResource(Imagen);
    }

    public void Finalizar(View view){
        finish();
    }
}