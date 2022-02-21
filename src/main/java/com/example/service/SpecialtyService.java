package com.example.service;

import org.springframework.stereotype.Service;

import com.example.dto.SpecialtyDTO;
import com.example.model.Specialty;

@Service
public class SpecialtyService extends AbstractService<Specialty, SpecialtyDTO> {

    public SpecialtyDTO findById(Long id) {
        return converter.toDTO(repository.findById(id).orElse(null));
    }
}
