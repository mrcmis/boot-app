package com.mis.marcin.boot_app.validation.annotations;

import com.mis.marcin.boot_app.validation.validators.PasswordValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;

@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, ANNOTATION_TYPE})
@Constraint(validatedBy = PasswordValidator.class)
public @interface PasswordCheck {
    String message() default "Password Validation Failure";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
