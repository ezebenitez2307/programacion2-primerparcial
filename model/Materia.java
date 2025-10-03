package com.example.programacion2.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "materias")
public class Materia {
    @PrimaryKey(autoGenerate = true)
    private int materiaId;
    private String nombre;
    private String codigo;


    public Materia(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }


}