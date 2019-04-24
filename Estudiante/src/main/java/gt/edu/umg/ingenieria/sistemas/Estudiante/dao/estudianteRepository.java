
package gt.edu.umg.ingenieria.sistemas.Estudiante.dao;

import gt.edu.umg.ingenieria.sistemas.Estudiante.model.estudianteModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface estudianteRepository extends CrudRepository<estudianteModel, Long> {
    
}