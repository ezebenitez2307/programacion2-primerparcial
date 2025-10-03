package com.example.programacion2.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ForeignKey;


@Entity(tableName = "calificaciones",
        foreignKeys = @ForeignKey(entity = Inscripcion.class,
                parentColumns = "inscripcionId",
                childColumns = "inscripcionId",
                onDelete = ForeignKey.CASCADE)
)
public class Calificacion {
    @PrimaryKey(autoGenerate = true)
    private int calificacionId;

    private int inscripcionId;
    private double valor;


    public Calificacion(int inscripcionId, double valor) {
        this.inscripcionId = inscripcionId;
        this.valor = valor;
    }


    public int getCalificacionId() { return calificacionId; }
    public void setCalificacionId(int calificacionId) { this.calificacionId = calificacionId; }
    public int getInscripcionId() { return inscripcionId; }
    public double getValor() { return valor; }
}
