package co.edu.ue.bank.controller;

import co.edu.ue.bank.model.Cuenta;
import co.edu.ue.bank.service.CuentaService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuentas")
public class CuentaController {

    private final CuentaService cuentaService;

    public CuentaController(CuentaService cuentaService) {
        this.cuentaService = cuentaService;
    }

    @PostMapping("/crear")
    public Cuenta crearCuenta(@RequestBody Cuenta cuenta) {
        return cuentaService.saveCuenta(cuenta);
    }

    @GetMapping("/{id}")
    public Cuenta getCuenta(@PathVariable Long id) {
        return cuentaService.findById(id);
    }

    @GetMapping("/")
    public List<Cuenta> getAllCuentas() {
        return cuentaService.findAll();
    }

    @PutMapping("/{id}")
    public Cuenta actualizarCuenta(@PathVariable Long id, @RequestBody Cuenta cuenta) {
        cuenta.setId(id);
        return cuentaService.saveCuenta(cuenta);
    }

    @DeleteMapping("/{id}")
    public void eliminarCuenta(@PathVariable Long id) {
        cuentaService.deleteById(id);
    }
}
