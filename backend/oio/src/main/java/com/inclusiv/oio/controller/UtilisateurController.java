package com.inclusiv.oio.controller;

import com.inclusiv.oio.service.UtilisateurService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping("/listeUtilisateur")
    public String vueListeUtilisateur(Model model){
        model.addAttribute("listeUtilisateur", utilisateurService.listeUtilisateur());
        return "listeUtilisateur";
    }
}
