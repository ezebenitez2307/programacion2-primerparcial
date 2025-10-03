package com.example.programacion2.repository;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.example.programacion2.dao.EstudianteDao;
import com.example.programacion2.database.AppDatabase;
import com.example.programacion2.model.Estudiante;
import java.util.List;

public class EstudianteRepository {

    private EstudianteDao estudianteDao;
    private LiveData<List<Estudiante>> allEstudiantes;

    public EstudianteRepository(Application application) {
        AppDatabase db = AppDatabase.getDatabase(application);
        estudianteDao = db.estudianteDao();
        allEstudiantes = estudianteDao.getAllEstudiantes();
    }


    public LiveData<List<Estudiante>> getAllEstudiantes() {
        return allEstudiantes;
    }


    public void insert(Estudiante estudiante) {
        AppDatabase.databaseWriteExecutor.execute(() -> {
            estudianteDao.insert(estudiante);
        });
    }


}
