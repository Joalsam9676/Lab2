
package gt.edu.umg.ingenieria.sistemas.Estudiante.controller;

import gt.edu.umg.ingenieria.sistemas.Estudiante.model.estudianteModel;
import gt.edu.umg.ingenieria.sistemas.Estudiante.service.estudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiante")
public class estudianteController {
    
    @Autowired
    private estudianteService studentService;
    
    @GetMapping("/getAll")
    public List<estudianteModel> getAll(){
        return this.studentService.todosEstudiantes();
    }
    
    @PostMapping("/create")
    public estudianteModel crear(@RequestBody(required = true) estudianteModel newStudent)
    {
        return this.studentService.CrearEstudiante(newStudent);
    }
}
