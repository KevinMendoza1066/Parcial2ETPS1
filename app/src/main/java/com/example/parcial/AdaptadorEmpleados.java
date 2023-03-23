package com.example.parcial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorEmpleados  extends ArrayAdapter<ModelEmpleado> {

    AppCompatActivity context;

    ArrayList<ModelEmpleado> ListEmpleados;

    Integer[] ImagenesEmp ;

    public AdaptadorEmpleados(AppCompatActivity c, ArrayList<ModelEmpleado> ListaEmpleados, Integer[] imgEmpleados ) {
        super(c, R.layout.lista_para_empleados, ListaEmpleados);
        context = c;
        ListEmpleados = ListaEmpleados;
        ImagenesEmp =imgEmpleados;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = this.context.getLayoutInflater();
        View vista = inflater.inflate(R.layout.lista_para_empleados,null);
        TextView tvNombre = vista.findViewById(R.id.tvNombre);
        TextView tvCargo = vista.findViewById(R.id.tvPuesto);
        TextView tvCompania = vista.findViewById(R.id.tvCompania);
        ImageView ImvImagen = vista.findViewById(R.id.imvFoto);
        //Asignacion de datos
        tvNombre.setText(ListEmpleados.get(position).getNombre());
        tvCargo.setText( ListEmpleados.get(position).getPosicion());
        tvCompania.setText(ListEmpleados.get(position).getEmpresa());
        ImvImagen.setImageResource(ImagenesEmp[position]);

        return (vista);

    }

}
