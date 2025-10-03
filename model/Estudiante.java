package com.example.programacion2.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "estudiantes")
public class Estudiante {


    @PrimaryKey(autoGenerate = true)
    private int estudianteId;

    private String nombre;
    private String codigo;


    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }




    public void setEstudianteId(int estudianteId) {
        this.estudianteId = estudianteId;
    }


    public int getEstudianteId() {
        return estudianteId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}