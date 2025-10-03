package com.example.programacion2.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.example.programacion2.model.Estudiante;
import java.util.List;

@Dao // Punto 3: Anotación DAO
public interface EstudianteDao {


    @Insert
    void insert(Estudiante estudiante);


    @Update
    void update(Estudiante estudiante);


    @Delete
    void delete(Estudiante estudiante);


    @Query("SELECT * FROM estudiantes ORDER BY nombre ASC")
    LiveData<List<Estudiante>> getAllEstudiantes();
}
