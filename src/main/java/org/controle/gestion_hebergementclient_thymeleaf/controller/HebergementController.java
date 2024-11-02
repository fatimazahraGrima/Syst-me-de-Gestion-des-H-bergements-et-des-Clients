package org.controle.gestion_hebergementclient_thymeleaf.controller;

import org.controle.gestion_hebergementclient_thymeleaf.service.HebergementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HebergementController {
    private final HebergementService hebergementService;

    public HebergementController(HebergementService hebergementService) {
        this.hebergementService = hebergementService;
    }

    @GetMapping("/hebergements")
    public String listHebergements(Model model) {
        model.addAttribute("hebergements", hebergementService.findAll());
        return "hebergements";
    }
}
