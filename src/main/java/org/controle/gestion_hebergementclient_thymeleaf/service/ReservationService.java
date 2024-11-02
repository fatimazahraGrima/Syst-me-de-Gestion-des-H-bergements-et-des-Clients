package org.controle.gestion_hebergementclient_thymeleaf.service;

import org.controle.gestion_hebergementclient_thymeleaf.model.Reservation;
import org.controle.gestion_hebergementclient_thymeleaf.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }


    public void save(Reservation reservation) {
        reservationRepository.save(reservation);
    }
}