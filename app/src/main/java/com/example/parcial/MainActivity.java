package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ModelEmpleado> ListaEmpleados;
    ListView lvEmplados;
    Integer []ImgEmpleados ={
            R.drawable.lead_photo_1,
            R.drawable.lead_photo_2,
            R.drawable.lead_photo_3,
            R.drawable.lead_photo_4,
            R.drawable.lead_photo_5,
            R.drawable.lead_photo_6,
            R.drawable.lead_photo_7,
            R.drawable.lead_photo_8,
            R.drawable.lead_photo_9,
            R.drawable.lead_photo_10

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListaEmpleados=new ArrayList<ModelEmpleado>();
        ListaEmpleados.add(new ModelEmpleado("Alenxander Pierrot","CEO","Insures S.O."));
        ListaEmpleados.add(new ModelEmpleado("Carlos Lopez ","Asistente","Hospital Blue"));
        ListaEmpleados.add(new ModelEmpleado("Sara Bonz","Directora de Marketing","Electrical Parts Itd"));
        ListaEmpleados.add(new ModelEmpleado("Liliana Clarence","Diseñadora de Producto","Creativa App"));
        ListaEmpleados.add(new ModelEmpleado("Benito Peralta","Supervisor de ventas","Neumaticos Press"));
        ListaEmpleados.add(new ModelEmpleado("Juan Jaramillo","CEO","Banco Nacional"));
        ListaEmpleados.add(new ModelEmpleado("Christian Steps","CTO","Cooperativa Verde"));
        ListaEmpleados.add(new ModelEmpleado("Alexa Giraldo","Lead Programmer","FrutySofy"));
        ListaEmpleados.add(new ModelEmpleado("Linda Murillo","Directora de Marketing","Seguros Boliver"));
        ListaEmpleados.add(new ModelEmpleado("Lizeth Astra","CEO","Concesionario Motolox"));
        AdaptadorEmpleados adaptador = new AdaptadorEmpleados(this,ListaEmpleados,ImgEmpleados);
        lvEmplados = findViewById(R.id.lvEmpleados);
        lvEmplados.setAdapter(adaptador);
        lvEmplados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String selectedItem =  parent.getItemAtPosition(position);
                ModelEmpleado datos = ListaEmpleados.get(position);
                Intent intent = new Intent(MainActivity.this, Datos.class);

                intent.putExtra("Nombre", datos.getNombre());
                intent.putExtra("Puesto", datos.getPosicion());
                intent.putExtra("Empresa", datos.getEmpresa());
                intent.putExtra("imagen", ImgEmpleados[position]);

                startActivity(intent);

            }

        });

    }
}