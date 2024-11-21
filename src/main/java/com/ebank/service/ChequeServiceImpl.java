package src.main.java.com.ebank.service;

import org.springframework.stereotype.Service;
import com.ebank.repository.ChequeRepository;
import com.ebank.model.Cheque;

import java.util.List;

@Service
public class ChequeServiceImpl implements ChequeService {

    private final ChequeRepository repository;

    public ChequeServiceImpl(ChequeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Cheque save(Cheque cheque) {
        return repository.save(cheque);
    }

    @Override
    public List<Cheque> findAll() {
        return repository.findAll();
    }
}
