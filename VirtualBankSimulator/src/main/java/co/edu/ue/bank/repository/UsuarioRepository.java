package co.edu.ue.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.bank.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
