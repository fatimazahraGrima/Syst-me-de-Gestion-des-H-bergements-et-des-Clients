package org.controle.gestion_hebergementclient_thymeleaf.repository;

import org.controle.gestion_hebergementclient_thymeleaf.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}