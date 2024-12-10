package co.edu.ue.bank.service;

import co.edu.ue.bank.model.Transaccion;
import co.edu.ue.bank.repository.TransaccionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaccionService {

    private final TransaccionRepository transaccionRepository;

    public TransaccionService(TransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }

    public Transaccion saveTransaccion(Transaccion transaccion) {
        return transaccionRepository.save(transaccion);
    }

    public Transaccion findById(Long id) {
        return transaccionRepository.findById(id).orElse(null);
    }

    public List<Transaccion> findAll() {
        return transaccionRepository.findAll();
    }

    public void deleteById(Long id) {
        transaccionRepository.deleteById(id);
    }
}
