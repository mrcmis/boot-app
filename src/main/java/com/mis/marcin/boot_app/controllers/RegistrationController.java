package com.mis.marcin.boot_app.controllers;

import com.mis.marcin.boot_app.models.User;
import com.mis.marcin.boot_app.repositories.UserRepository;
import com.mis.marcin.boot_app.validation.validators.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private UserValidator userValdiator;


//    @InitBinder
//    protected void initBinder(WebDataBinder binder){
//        binder.addValidators(userValdiator);
//    }

    @GetMapping(value = "/registry")
    public String registry(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "registry";
    }

    @PostMapping(value = "/registry")
    public String registred(@ModelAttribute("user") @Validated User user, BindingResult bindingResult){
        if(!bindingResult.hasErrors())
            userRepository.save(user);
        return "registry";
    }


}
