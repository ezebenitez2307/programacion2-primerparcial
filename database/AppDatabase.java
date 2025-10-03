package com.example.programacion2.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.example.programacion2.dao.EstudianteDao;
import com.example.programacion2.model.Estudiante;
import com.example.programacion2.model.Materia;
import com.example.programacion2.model.Inscripcion;
import com.example.programacion2.model.Calificacion;


@Database(entities = {Estudiante.class, Materia.class, Inscripcion.class, Calificacion.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {


    public abstract EstudianteDao estudianteDao();


    private static volatile AppDatabase INSTANCE;

    public static AppDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    AppDatabase.class, "programacion2_db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
