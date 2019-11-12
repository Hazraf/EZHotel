package com.cyan.hotel.controller;

import com.cyan.hotel.repositoryService.LoginService;
import com.cyan.hotel.repositoryService.RegistrationService;
import com.cyan.hotel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/

@Controller
public class UserController {

//    @Autowired
//    UserRepository userRepository;

    @Autowired
    LoginService loginService;

    @Autowired
    RegistrationService registrationService;

    /*
    @PostMapping(value = "/register")
    public String register(@ModelAttribute("guestForm") Guest guestForm,
                           BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "register";
        }

        // TODO: ERROR occurs, need to be changed
        return "redirect:/home";
    }*/

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {


        return "register";
    }

    @GetMapping(value = "/login")
    public String login(Model model, String error, String logout) {

        if (null != error)
            model.addAttribute("error", "Invalid username or password!");
        if (null != logout)
            model.addAttribute("logout", "You have logged out successfully!");

        return "login";
    }
}
