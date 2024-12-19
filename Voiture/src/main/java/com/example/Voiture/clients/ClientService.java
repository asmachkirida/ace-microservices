package com.example.Voiture.clients;

import com.example.Voiture.entities.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CLIENT")
public interface ClientService {

    @GetMapping(path = "/client/{id}")
    public Client clientById(@PathVariable Long id);
}
