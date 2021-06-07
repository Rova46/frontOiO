package com.inclusiv.oio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OioCOntroller {

    @GetMapping("/")
    public String vuePageAccueil(){
        return "oio";
    }
}
