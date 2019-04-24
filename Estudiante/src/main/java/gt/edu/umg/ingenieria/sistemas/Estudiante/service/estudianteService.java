
package gt.edu.umg.ingenieria.sistemas.Estudiante.service;

import gt.edu.umg.ingenieria.sistemas.Estudiante.dao.estudianteRepository;
import gt.edu.umg.ingenieria.sistemas.Estudiante.model.estudianteModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class estudianteService {
    @Autowired
    private estudianteRepository studentRepository;
    
    public List<estudianteModel> todosEstudiantes()
    {
        return (List<estudianteModel>) this.studentRepository.findAll();
    }
    
    public estudianteModel CrearEstudiante(estudianteModel Estudiante){
        return this.studentRepository.save(Estudiante);
    }
}
