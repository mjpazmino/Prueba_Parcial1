package ec.edu.espe.prueba.seguridad.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "seg_usuario")
public class Usuario {
    @Id
    @Column(name = "cod_usuario", nullable = false)
    private Integer codUsuario;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "estado", nullable = false)
    private String estado;
    @Column(name = "clave", nullable = false)
    private String clave;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<UsuarioEspacio> usuarioEspacios;

    public Usuario() {

    }

    public Usuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<UsuarioEspacio> getUsuarioEspacios() {
        return usuarioEspacios;
    }

    public void setUsuarioEspacios(List<UsuarioEspacio> usuarioEspacios) {
        this.usuarioEspacios = usuarioEspacios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return codUsuario.equals(usuario.codUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codUsuario);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "codUsuario=" + codUsuario +
                ", username='" + username + '\'' +
                ", nombre='" + nombre + '\'' +
                ", estado='" + estado + '\'' +
                ", clave='" + clave + '\'' +
                '}';
    }
}
