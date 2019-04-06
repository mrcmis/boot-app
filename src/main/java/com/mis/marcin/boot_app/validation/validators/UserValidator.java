package com.mis.marcin.boot_app.validation.validators;

import com.mis.marcin.boot_app.models.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        //return User.class.isAssignableFrom(aClass);
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User)o;

        System.out.println("xdxdxdxdxdx");
        if(user.getPassword().length() < 6){
            errors.rejectValue("password", "err_code", "password to short");
        }
    }
}
