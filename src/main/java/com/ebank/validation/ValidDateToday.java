package src.main.java.com.ebank.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DateTodayValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidDateToday {
    String message() default "La fecha no es válida";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
