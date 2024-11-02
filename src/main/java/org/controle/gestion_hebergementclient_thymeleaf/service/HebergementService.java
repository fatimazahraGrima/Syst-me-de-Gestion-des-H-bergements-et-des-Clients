package org.controle.gestion_hebergementclient_thymeleaf.service;


import org.controle.gestion_hebergementclient_thymeleaf.model.Hebergement;
import org.controle.gestion_hebergementclient_thymeleaf.repository.HebergementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HebergementService {

    private final HebergementRepository hebergementRepository;

    public HebergementService(HebergementRepository hebergementRepository) {
        this.hebergementRepository = hebergementRepository;
    }

    public List<Hebergement> findAll() {
        return hebergementRepository.findAll();
    }
    public Hebergement findById(Long id) {
        return hebergementRepository.findById(id).orElse(null);
    }

    public Hebergement save(Hebergement hebergement) {
        return hebergementRepository.save(hebergement);
    }
}