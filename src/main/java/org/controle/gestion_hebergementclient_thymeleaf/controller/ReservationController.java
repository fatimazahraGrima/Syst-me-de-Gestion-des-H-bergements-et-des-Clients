package org.controle.gestion_hebergementclient_thymeleaf.controller;

import org.controle.gestion_hebergementclient_thymeleaf.model.Client;
import org.controle.gestion_hebergementclient_thymeleaf.model.Hebergement;
import org.controle.gestion_hebergementclient_thymeleaf.model.Reservation;
import org.controle.gestion_hebergementclient_thymeleaf.service.ClientService;
import org.controle.gestion_hebergementclient_thymeleaf.service.HebergementService;
import org.controle.gestion_hebergementclient_thymeleaf.service.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@Controller
public class ReservationController {
    private final ReservationService reservationService;
    private final ClientService clientService;
    private final HebergementService hebergementService;

    public ReservationController(ReservationService reservationService, ClientService clientService, HebergementService hebergementService) {
        this.reservationService = reservationService;
        this.clientService = clientService;
        this.hebergementService = hebergementService;
    }

    @GetMapping("/reservations")
    public String listReservations(Model model) {
        model.addAttribute("reservations", reservationService.findAll());
        return "reservations";
    }

    @PostMapping("/reservations")
    public String createReservation(@ModelAttribute("reservation") Reservation reservation) {
        Client client = clientService.findById(reservation.getClient().getId());
        Hebergement hebergement = hebergementService.findById(reservation.getHebergement().getId());

        reservation.setClient(client);
        reservation.setHebergement(hebergement);
        reservationService.save(reservation);

        return "redirect:/reservations";
    }

    @GetMapping("/reservations/add")
    public String showAddReservationForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        model.addAttribute("clients", clientService.findAll());
        model.addAttribute("hebergements", hebergementService.findAll());
        return "add-reservation";
    }

    @PostMapping("/reservations/add")
    public String addReservation(@ModelAttribute Reservation reservation,
                                 @RequestParam String newClientName,
                                 @RequestParam String newClientEmail,
                                 Model model) {
        // Création d'un nouveau client
        Client newClient = new Client();
        newClient.setNom(newClientName);
        newClient.setEmail(newClientEmail);

        // Sauvegarde du client dans la base de données
        clientService.save(newClient);

        // Associe le nouveau client à la réservation
        reservation.setClient(newClient);

        // Associe l'hébergement à la réservation
        Hebergement hebergement = hebergementService.findById(reservation.getHebergement().getId());
        reservation.setHebergement(hebergement);

        // Sauvegarde la réservation
        reservationService.save(reservation);

        return "redirect:/reservations";
    }

}
