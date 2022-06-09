package ec.edu.espe.prueba.gestion.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "gdc_espacio")
public class Espacio {

    @Id
    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "fecha_creacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    public Espacio() {
    }

    public Espacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Espacio espacio = (Espacio) o;
        return codEspacio.equals(espacio.codEspacio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codEspacio);
    }

    @Override
    public String toString() {
        return "Espacio{" +
                "codEspacio=" + codEspacio +
                ", nombre='" + nombre + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}


