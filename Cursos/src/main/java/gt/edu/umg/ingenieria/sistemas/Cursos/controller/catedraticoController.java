
package gt.edu.umg.ingenieria.sistemas.Cursos.controller;

import gt.edu.umg.ingenieria.sistemas.Cursos.model.catedraticoModel;
import gt.edu.umg.ingenieria.sistemas.Cursos.service.catedraticoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catedratico")
public class catedraticoController {
    @Autowired
    private catedraticoService catService;
    
    @GetMapping("/buscarTodos")
    public List<catedraticoModel> getAll(){
        return this.catService.todoscatedraticos();
    }
    
    @PostMapping("/crear")
    public catedraticoModel crear(@RequestBody(required = true) catedraticoModel nuevoCat)
    {
        return this.catService.crearCatedratico(nuevoCat);
    }
}
