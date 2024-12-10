package co.edu.ue.bank.service;

import co.edu.ue.bank.model.Cuenta;
import co.edu.ue.bank.repository.CuentaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaService {

    private final CuentaRepository cuentaRepository;

    public CuentaService(CuentaRepository cuentaRepository) {
        this.cuentaRepository = cuentaRepository;
    }

    public Cuenta saveCuenta(Cuenta cuenta) {
        return cuentaRepository.save(cuenta);
    }

    public Cuenta findById(Long id) {
        return cuentaRepository.findById(id).orElse(null);
    }

    public List<Cuenta> findAll() {
        return cuentaRepository.findAll();
    }

    public void deleteById(Long id) {
        cuentaRepository.deleteById(id);
    }
}
