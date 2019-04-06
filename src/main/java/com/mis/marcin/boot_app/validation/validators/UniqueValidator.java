package com.mis.marcin.boot_app.validation.validators;

import com.mis.marcin.boot_app.repositories.UserRepository;
import com.mis.marcin.boot_app.validation.annotations.UniqueCheck;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueValidator implements ConstraintValidator<UniqueCheck,String> {
    @Autowired
    UserRepository userRepository;

    @Override
    public void initialize(UniqueCheck constraintAnnotation) {
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return userRepository.findByUsername(s) == null;
    }
}
