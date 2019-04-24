
package gt.edu.umg.ingenieria.sistemas.Cursos.controller;

import gt.edu.umg.ingenieria.sistemas.Cursos.model.cursoModel;
import gt.edu.umg.ingenieria.sistemas.Cursos.service.cursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class cursoController {
    @Autowired
    private cursoService curService;
    
    @GetMapping("/buscarTodos")
    public List<cursoModel> getAll(){
        return this.curService.todoscursos();
    }
    
    @PostMapping("/crear")
    public cursoModel crear(@RequestBody(required = true) cursoModel nuevoCurso)
    {
        return this.curService.crearCurso(nuevoCurso);
    }
}
