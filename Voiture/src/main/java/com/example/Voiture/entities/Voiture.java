package com.example.Voiture.entities;

import jakarta.persistence.*;

@Entity
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marque;
    private String matricule;
    private String model;

    @Column(name = "client_id")
    private Long clientId; // This is the ID of the client (foreign key)

    @Transient
    @ManyToOne
    private Client client; // This is the Client object associated with the Voiture

    // Default constructor
    public Voiture() {
    }

    // Constructor with parameters
    public Voiture(Long id, String marque, String matricule, String model, Long clientId, Client client) {
        this.id = id;
        this.marque = marque;
        this.matricule = matricule;
        this.model = model;
        this.clientId = clientId;
        this.client = client;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
