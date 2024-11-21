package src.test.java.com.ebank;

import com.ebank.model.Cheque;
import com.ebank.service.ChequeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ChequeApplicationTests {

    @Autowired
    private ChequeService chequeService;

    @Test
    void contextLoads() {
        assertThat(chequeService).isNotNull();
    }

    @Test
    void testSaveCheque() {
        Cheque cheque = new Cheque();
        cheque.setFecha("2024-11-20");
        cheque.setDestinatario("Carlos Pérez");
        cheque.setMonto("100000");
        cheque.setFirma("Carlos P.");

        Cheque savedCheque = chequeService.save(cheque);
        assertThat(savedCheque).isNotNull();
        assertThat(savedCheque.getId()).isNotNull();
    }

    @Test
    void testFindAllCheques() {
        List<Cheque> cheques = chequeService.findAll();
        assertThat(cheques).isNotEmpty();
    }
}

