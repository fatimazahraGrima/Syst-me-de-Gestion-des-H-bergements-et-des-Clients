package org.controle.gestion_hebergementclient_thymeleaf.repository;

import org.controle.gestion_hebergementclient_thymeleaf.model.Hebergement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HebergementRepository extends JpaRepository<Hebergement, Long> {
}