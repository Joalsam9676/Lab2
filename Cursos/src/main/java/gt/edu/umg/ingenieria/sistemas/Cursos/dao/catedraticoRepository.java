
package gt.edu.umg.ingenieria.sistemas.Cursos.dao;

import gt.edu.umg.ingenieria.sistemas.Cursos.model.catedraticoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface catedraticoRepository extends CrudRepository<catedraticoModel, Long>{
    
}
