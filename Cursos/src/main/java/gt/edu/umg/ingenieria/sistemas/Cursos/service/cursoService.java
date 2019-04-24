
package gt.edu.umg.ingenieria.sistemas.Cursos.service;

import gt.edu.umg.ingenieria.sistemas.Cursos.dao.cursoRepository;
import gt.edu.umg.ingenieria.sistemas.Cursos.model.cursoModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cursoService {
    @Autowired
    private cursoRepository cursoRepo;
            
    public cursoModel crearCurso(cursoModel cursos)
    {
        return this.cursoRepo.save(cursos);
    }
     public List<cursoModel> todoscursos()
    {
        return (List<cursoModel>) this.cursoRepo.findAll();
    }
}
