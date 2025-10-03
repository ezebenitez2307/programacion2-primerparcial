package com.example.programacion2.viewmodel;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.example.programacion2.model.Estudiante;
import com.example.programacion2.repository.EstudianteRepository;
import java.util.List;

public class EstudianteViewModel extends AndroidViewModel {

    private EstudianteRepository repository;
    private final LiveData<List<Estudiante>> allEstudiantes;

    public EstudianteViewModel(Application application) {
        super(application);
        repository = new EstudianteRepository(application);
        allEstudiantes = repository.getAllEstudiantes();
    }


    public LiveData<List<Estudiante>> getAllEstudiantes() {
        return allEstudiantes;
    }


    public void insert(Estudiante estudiante) {
        repository.insert(estudiante);
    }
}
