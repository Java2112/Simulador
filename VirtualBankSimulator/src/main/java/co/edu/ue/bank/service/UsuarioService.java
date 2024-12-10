package co.edu.ue.bank.service;

import co.edu.ue.bank.model.Usuario;
import co.edu.ue.bank.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario findByUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public void deleteByUsername(String username) {
        Usuario usuario = usuarioRepository.findByUsername(username);
        if (usuario != null) {
            usuarioRepository.delete(usuario);
        }
    }
}
