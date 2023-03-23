package com.example.parcial;

public class ModelEmpleado {

    public ModelEmpleado(String nombre, String posicion, String empresa) {
        Nombre = nombre;
        Posicion = posicion;
        Empresa = empresa;
    }

    private String Nombre;
    private String Posicion;
    private String Empresa;



    public String getNombre() {
        return Nombre;
    }

    public String getPosicion() {
        return Posicion;
    }


    public String getEmpresa() {
        return Empresa;
    }


}
