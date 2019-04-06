package com.mis.marcin.boot_app.validation.validators;

import com.mis.marcin.boot_app.validation.annotations.PasswordCheck;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<PasswordCheck, String> {
    @Override
    public void initialize(PasswordCheck constraintAnnotation) {
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return (email.length() > 6);
    }
}
