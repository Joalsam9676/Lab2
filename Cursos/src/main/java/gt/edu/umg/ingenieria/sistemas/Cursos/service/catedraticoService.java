
package gt.edu.umg.ingenieria.sistemas.Cursos.service;

import gt.edu.umg.ingenieria.sistemas.Cursos.dao.catedraticoRepository;
import gt.edu.umg.ingenieria.sistemas.Cursos.model.catedraticoModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class catedraticoService {
    @Autowired
    private catedraticoRepository catedraticoRepo;
    
    public catedraticoModel crearCatedratico(catedraticoModel catedraticos)
    {
        return this.catedraticoRepo.save(catedraticos);
    }
     public List<catedraticoModel> todoscatedraticos()
    {
        return (List<catedraticoModel>) this.catedraticoRepo.findAll();
    }
}
