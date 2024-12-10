package co.edu.ue.bank.controller;

import co.edu.ue.bank.model.Usuario;
import co.edu.ue.bank.service.UsuarioService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/crear")
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioService.saveUsuario(usuario);
    }

    @GetMapping("/{username}")
    public Usuario getUsuario(@PathVariable String username) {
        return usuarioService.findByUsername(username);
    }

    @GetMapping("/")
    public List<Usuario> getAllUsuarios() {
        return usuarioService.findAll();
    }

    @PutMapping("/{username}")
    public Usuario actualizarUsuario(@PathVariable String username, @RequestBody Usuario usuario) {
        usuario.setUsername(username);
        return usuarioService.saveUsuario(usuario);
    }

    @DeleteMapping("/{username}")
    public void eliminarUsuario(@PathVariable String username) {
        usuarioService.deleteByUsername(username);
    }
}
