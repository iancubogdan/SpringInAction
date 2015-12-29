package com.springinaction.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Bogdan on 12/29/2015.
 */
@Controller
@RequestMapping("/spitter")
public class SpitterController {

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm(){
        return "registerForm";
    }
}
