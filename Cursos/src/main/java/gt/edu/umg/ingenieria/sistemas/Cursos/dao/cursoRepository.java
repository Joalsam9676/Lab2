
package gt.edu.umg.ingenieria.sistemas.Cursos.dao;

import gt.edu.umg.ingenieria.sistemas.Cursos.model.cursoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cursoRepository extends CrudRepository<cursoModel, Long> {
    
}
