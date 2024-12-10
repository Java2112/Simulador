package co.edu.ue.bank.service;

import co.edu.ue.bank.model.Producto;
import co.edu.ue.bank.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto findById(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    public void deleteById(Long id) {
        productoRepository.deleteById(id);
    }
}

