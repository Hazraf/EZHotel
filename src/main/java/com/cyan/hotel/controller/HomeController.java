package com.cyan.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Naichuan Zhang
 * @create: 23-Oct-2019
 **/

@Controller
public class HomeController {

    // set initial home page.
    @GetMapping(value = "/")
    public String home() {
        return "home";
    }

    @GetMapping(value = "/contact")
    public String contact() {

        return "contact";
    }

    @GetMapping(value = "/about")
    public String about() {

        return "about";
    }
}
