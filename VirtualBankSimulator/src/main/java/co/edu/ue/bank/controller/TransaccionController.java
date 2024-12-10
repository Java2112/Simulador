package co.edu.ue.bank.controller;

import co.edu.ue.bank.model.Transaccion;
import co.edu.ue.bank.service.TransaccionService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transacciones")
public class TransaccionController {

    private final TransaccionService transaccionService;

    public TransaccionController(TransaccionService transaccionService) {
        this.transaccionService = transaccionService;
    }

    @PostMapping("/realizar")
    public Transaccion realizarTransaccion(@RequestBody Transaccion transaccion) {
        return transaccionService.saveTransaccion(transaccion);
    }

    @GetMapping("/{id}")
    public Transaccion getTransaccion(@PathVariable Long id) {
        return transaccionService.findById(id);
    }

    @GetMapping("/")
    public List<Transaccion> getAllTransacciones() {
        return transaccionService.findAll();
    }

    @PutMapping("/{id}")
    public Transaccion actualizarTransaccion(@PathVariable Long id, @RequestBody Transaccion transaccion) {
        transaccion.setId(id);
        return transaccionService.saveTransaccion(transaccion);
    }

    @DeleteMapping("/{id}")
    public void eliminarTransaccion(@PathVariable Long id) {
        transaccionService.deleteById(id);
    }
}
