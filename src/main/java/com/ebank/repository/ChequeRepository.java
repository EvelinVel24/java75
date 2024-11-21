package src.main.java.com.ebank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ebank.model.Cheque;

public interface ChequeRepository extends JpaRepository<Cheque, Long> {
}
