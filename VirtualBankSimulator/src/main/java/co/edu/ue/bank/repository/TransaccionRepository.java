package co.edu.ue.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.bank.model.Transaccion;

public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {
}
