package com.example.programacion2.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ForeignKey;

@Entity(tableName = "inscripciones",
        foreignKeys = {
                @ForeignKey(entity = Estudiante.class,
                        parentColumns = "estudianteId",
                        childColumns = "estudianteId",
                        onDelete = ForeignKey.CASCADE),
                @ForeignKey(entity = Materia.class,
                        parentColumns = "materiaId",
                        childColumns = "materiaId",
                        onDelete = ForeignKey.CASCADE)
        })
public class Inscripcion {
    @PrimaryKey(autoGenerate = true)
    private int inscripcionId;
    private int estudianteId;
    private int materiaId;
    private String fechaInscripcion;


}
