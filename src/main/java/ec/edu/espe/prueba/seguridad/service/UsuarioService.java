package ec.edu.espe.prueba.seguridad.service;

import ec.edu.espe.prueba.seguridad.dao.UsuarioEspacioRepository;
import ec.edu.espe.prueba.seguridad.dao.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;
    private UsuarioEspacioRepository usuarioEspacioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository, UsuarioEspacioRepository usuarioEspacioRepository) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioEspacioRepository = usuarioEspacioRepository;
    }

}
