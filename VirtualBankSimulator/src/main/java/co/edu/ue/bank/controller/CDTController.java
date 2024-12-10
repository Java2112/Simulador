package co.edu.ue.bank.controller;

import co.edu.ue.bank.model.CDT;
import co.edu.ue.bank.service.CDTService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cdt")
public class CDTController {

    private final CDTService cdtService;

    public CDTController(CDTService cdtService) {
        this.cdtService = cdtService;
    }

    @PostMapping("/crear")
    public CDT crearCDT(@RequestBody CDT cdt) {
        return cdtService.saveCDT(cdt);
    }

    @GetMapping("/{id}")
    public CDT getCDT(@PathVariable Long id) {
        return cdtService.findById(id);
    }

    @GetMapping("/")
    public List<CDT> getAllCDTs() {
        return cdtService.findAll();
    }

    @PutMapping("/{id}")
    public CDT actualizarCDT(@PathVariable Long id, @RequestBody CDT cdt) {
        cdt.setId(id);
        return cdtService.saveCDT(cdt);
    }

    @DeleteMapping("/{id}")
    public void eliminarCDT(@PathVariable Long id) {
        cdtService.deleteById(id);
    }
}
