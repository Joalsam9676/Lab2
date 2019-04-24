
package gt.edu.umg.ingenieria.sistemas.Cursos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "catedratico")
public class catedraticoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name ="id")
    private long id;
    @Column(name ="nombre")
    private String nombre;
    @Column(name ="apellido")
    private String apellido;
    @Column(name ="codigo_catedratico")
    private String codigo_catedratico;

    public catedraticoModel() {
    }

    public catedraticoModel(long id, String nombre, String apellido, String codigo_catedratico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo_catedratico = codigo_catedratico;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo_catedratico() {
        return codigo_catedratico;
    }

    public void setCodigo_catedratico(String codigo_catedratico) {
        this.codigo_catedratico = codigo_catedratico;
    }
    
    
}
