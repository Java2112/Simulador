package co.edu.ue.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.bank.model.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
    Cuenta findByUsuarioId(Long usuarioId);
}
