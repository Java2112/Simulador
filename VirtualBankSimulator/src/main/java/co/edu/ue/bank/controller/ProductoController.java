package co.edu.ue.bank.controller;

import co.edu.ue.bank.model.Producto;
import co.edu.ue.bank.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @PostMapping("/crear")
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoService.saveProducto(producto);
    }

    @GetMapping("/{id}")
    public Producto getProducto(@PathVariable Long id) {
        return productoService.findById(id);
    }

    @GetMapping("/")
    public List<Producto> getAllProductos() {
        return productoService.findAll();
    }

    @PutMapping("/{id}")
    public Producto actualizarProducto(@PathVariable Long id, @RequestBody Producto producto) {
        producto.setId(id);
        return productoService.saveProducto(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoService.deleteById(id);
    }
}
