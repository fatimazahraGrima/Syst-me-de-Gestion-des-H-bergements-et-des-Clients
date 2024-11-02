package org.controle.gestion_hebergementclient_thymeleaf.repository;
import org.controle.gestion_hebergementclient_thymeleaf.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}