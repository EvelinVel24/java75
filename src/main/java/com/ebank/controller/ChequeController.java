package src.main.java.com.ebank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.ebank.model.Cheque;
import com.ebank.service.ChequeService;

@Controller
public class ChequeController {

    @Autowired
    private ChequeService service;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("cheque", new Cheque());
        return "home";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Cheque cheque, Model model) {
        service.save(cheque);
        model.addAttribute("destinatario", cheque.getDestinatario());
        model.addAttribute("fecha", cheque.getFecha());
        model.addAttribute("monto", cheque.getMonto());
        return "success";
    }
}
