package pl.atd.errorhandling.service;

import org.springframework.stereotype.Service;
import pl.atd.errorhandling.exception.CowNotFoundException;
import pl.atd.errorhandling.model.Cow;
import pl.atd.errorhandling.repository.CowRepository;

@Service
public class CowService {
    private CowRepository cowRepository;


    public CowService(CowRepository cowRepository) {
        this.cowRepository = cowRepository;
    }

    public Cow getCow(Long id) throws CowNotFoundException {
        return cowRepository.findById(id).orElseThrow(() -> new CowNotFoundException(id));
    }
}
