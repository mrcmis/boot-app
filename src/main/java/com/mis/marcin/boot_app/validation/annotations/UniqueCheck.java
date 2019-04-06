package com.mis.marcin.boot_app.validation.annotations;


import com.mis.marcin.boot_app.validation.validators.PasswordValidator;
import com.mis.marcin.boot_app.validation.validators.UniqueValidator;

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
@Constraint(validatedBy = UniqueValidator.class)
public @interface UniqueCheck{
    String message() default "Unique Validation Failure";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
