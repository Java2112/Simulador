package co.edu.ue.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.bank.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
