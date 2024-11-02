package org.controle.gestion_hebergementclient_thymeleaf.model;
import javax.persistence.*;

@Entity
public class Hebergement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String adresse;
    private double prix;

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }
}
