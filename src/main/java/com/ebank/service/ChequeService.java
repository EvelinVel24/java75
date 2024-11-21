package src.main.java.com.ebank.service;

import java.util.List;
import com.ebank.model.Cheque;

public interface ChequeService {
    Cheque save(Cheque cheque);
    List<Cheque> findAll();
}
