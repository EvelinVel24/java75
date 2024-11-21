package src.main.java.com.ebank.model;

import jakarta.validation.constraints.*;
import com.ebank.validation.ValidDateToday;

public class Cheque {

    private Long id;

    @NotBlank(message = "La fecha es obligatoria")
    @ValidDateToday(message = "La fecha debe coincidir con el día actual")
    private String fecha;

    @NotBlank(message = "El destinatario es obligatorio")
    private String destinatario;

    @NotBlank(message = "El monto es obligatorio")
    private String monto;

    @NotBlank(message = "La firma es obligatoria")
    private String firma;

    // Getters y Setters
}
