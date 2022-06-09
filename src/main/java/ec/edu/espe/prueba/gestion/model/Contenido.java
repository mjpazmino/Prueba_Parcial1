package ec.edu.espe.prueba.gestion.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "gdc_contenido")
public class Contenido {

    @Id
    @Column(name = "cod_contenido", nullable = false)
    private Integer codContenido;
    @JoinColumn(name = "cod_espacio", referencedColumnName = "cod_espacio", insertable = false, updatable = false)
    @ManyToOne
    private Espacio espacio;
    @JoinColumn(name = "cod_contenido_padre", referencedColumnName = "cod_contenido_padre", insertable = false, updatable = false)
    @ManyToOne
    private Contenido contenidoPadre;
    @Column(name = "tipo_contenido", nullable = false)
    private Integer tipoContenido;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "nombre_archivo", nullable = false)
    private String nombreArchivo;
    @Version
    @Column(name = "version", nullable = false)
    private Integer version;
    @Column(name = "estado", nullable = false)
    private Integer estado;

    public Contenido() {
    }

    public Contenido(Integer codContenido) {
        this.codContenido = codContenido;
    }

    public Integer getCodContenido() {
        return codContenido;
    }

    public void setCodContenido(Integer codContenido) {
        this.codContenido = codContenido;
    }

    public Espacio getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }

    public Contenido getContenidoPadre() {
        return contenidoPadre;
    }

    public void setContenidoPadre(Contenido contenidoPadre) {
        this.contenidoPadre = contenidoPadre;
    }

    public Integer getTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(Integer tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contenido contenido = (Contenido) o;
        return codContenido.equals(contenido.codContenido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codContenido);
    }

    @Override
    public String toString() {
        return "Contenido{" +
                "codContenido=" + codContenido +
                ", espacio=" + espacio +
                ", contenidoPadre=" + contenidoPadre +
                ", tipoContenido=" + tipoContenido +
                ", nombre='" + nombre + '\'' +
                ", nombreArchivo='" + nombreArchivo + '\'' +
                ", version=" + version +
                ", estado=" + estado +
                '}';
    }
}
