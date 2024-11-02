package org.controle.gestion_hebergementclient_thymeleaf.service;

import org.controle.gestion_hebergementclient_thymeleaf.model.Client;
import org.controle.gestion_hebergementclient_thymeleaf.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }
    public Client findById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public void save(Client client) {
        clientRepository.save(client);
    }
}