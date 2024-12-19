package com.example.Voiture.services;

import com.example.Voiture.entities.Voiture;
import com.example.Voiture.repositories.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VoitureService {

    @Autowired
    VoitureRepository voitureRepository;

    @Transactional
    public Voiture enregistrerVoiture(Voiture voiture) {
        // Add any business logic needed before saving the voiture (if applicable)
        return voitureRepository.save(voiture);
    }

    @Transactional
    public Voiture updateVoiture(Long id, Voiture updatedVoiture) throws Exception {
        // Fetch the voiture from the repository
        Voiture existingVoiture = voitureRepository.findById(id)
                .orElseThrow(() -> new Exception("Voiture not found with ID: " + id));

        // Update fields with non-null values from updatedVoiture
        if (updatedVoiture.getMatricule() != null && !updatedVoiture.getMatricule().isEmpty()) {
            existingVoiture.setMatricule(updatedVoiture.getMatricule());
        }
        if (updatedVoiture.getMarque() != null && !updatedVoiture.getMarque().isEmpty()) {
            existingVoiture.setMarque(updatedVoiture.getMarque());
        }
        if (updatedVoiture.getModel() != null && !updatedVoiture.getModel().isEmpty()) {
            existingVoiture.setModel(updatedVoiture.getModel());
        }

        // Save the updated Voiture
        return voitureRepository.save(existingVoiture);
    }

    @Transactional
    public Voiture findById(Long id) throws Exception {
        return voitureRepository.findById(id)
                .orElseThrow(() -> new Exception("Voiture not found with ID: " + id));
    }

    @Transactional
    public List<Voiture> findByClientId(Long clientId) {
        return voitureRepository.findByClientId(clientId);
    }

}
