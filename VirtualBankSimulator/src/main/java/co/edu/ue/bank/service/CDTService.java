package co.edu.ue.bank.service;

import co.edu.ue.bank.model.CDT;
import co.edu.ue.bank.repository.CDTRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CDTService {

    private final CDTRepository cdtRepository;

    public CDTService(CDTRepository cdtRepository) {
        this.cdtRepository = cdtRepository;
    }

    public CDT saveCDT(CDT cdt) {
        return cdtRepository.save(cdt);
    }

    public CDT findById(Long id) {
        return cdtRepository.findById(id).orElse(null);
    }

    public List<CDT> findAll() {
        return cdtRepository.findAll();
    }

    public void deleteById(Long id) {
        cdtRepository.deleteById(id);
    }
}
