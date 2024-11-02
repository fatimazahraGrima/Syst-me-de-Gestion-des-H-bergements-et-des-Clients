package org.controle.gestion_hebergementclient_thymeleaf.controller;


import org.controle.gestion_hebergementclient_thymeleaf.model.Client;
import org.controle.gestion_hebergementclient_thymeleaf.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients")
    public String listClients(Model model) {
        model.addAttribute("clients", clientService.findAll());
        return "clients";
    }
    @GetMapping("/clients/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("client", new Client());
        return "register-client";
    }

    @PostMapping("/clients/register")
    public String registerClient(@ModelAttribute("client") Client client) {
        clientService.save(client);
        return "redirect:/clients";
    }
    }