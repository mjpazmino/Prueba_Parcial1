package ec.edu.espe.prueba.gestion.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "gdc_contenido_version")
public class ContenidoVersion {

    @Id
    @Column(name = "cod_contenido_version", nullable = false)
    private Integer codContenidoVersion;
    @JoinColumn(name = "cod_contenido", referencedColumnName = "cod_contenido", nullable = false)
    @ManyToOne(optional = false)
    private Contenido contenido;
    @Column(name = "hash_archivo", nullable = false)
    private String hashArchivo;
    @Column(name = "nombre_archivo", nullable = false)
    private String nombreArchivo;
    @Column(name = "tamanio", nullable = false)
    private Integer tamanio;
    @Version
    @Column(name = "version", nullable = false)
    private Integer version;
    @Column(name = "comentario", nullable = false)
    private String comentario;
    @Column(name = "fecha_creacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "cod_usuario_creacion", nullable = false)
    private Integer codUsuarioCreacion;

    public ContenidoVersion() {
    }

    public ContenidoVersion(Integer codContenidoVersion) {
        this.codContenidoVersion = codContenidoVersion;
    }

    public Integer getCodContenidoVersion() {
        return codContenidoVersion;
    }

    public void setCodContenidoVersion(Integer codContenidoVersion) {
        this.codContenidoVersion = codContenidoVersion;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public String getHashArchivo() {
        return hashArchivo;
    }

    public void setHashArchivo(String hashArchivo) {
        this.hashArchivo = hashArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getCodUsuarioCreacion() {
        return codUsuarioCreacion;
    }

    public void setCodUsuarioCreacion(Integer codUsuarioCreacion) {
        this.codUsuarioCreacion = codUsuarioCreacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContenidoVersion that = (ContenidoVersion) o;
        return codContenidoVersion.equals(that.codContenidoVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codContenidoVersion);
    }

    @Override
    public String toString() {
        return "ContenidoVersion{" +
                "codContenidoVersion=" + codContenidoVersion +
                ", contenido=" + contenido +
                ", hashArchivo='" + hashArchivo + '\'' +
                ", nombreArchivo='" + nombreArchivo + '\'' +
                ", tamanio=" + tamanio +
                ", version=" + version +
                ", comentario='" + comentario + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", codUsuarioCreacion=" + codUsuarioCreacion +
                '}';
    }
}
