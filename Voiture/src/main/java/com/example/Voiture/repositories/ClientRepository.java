package com.example.Voiture.repositories;

import com.example.Voiture.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findClientById(Long id);
}
