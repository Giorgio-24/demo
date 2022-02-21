package com.example.service;

import org.springframework.stereotype.Service;

import com.example.dto.ClinicDTO;
import com.example.model.Clinic;

@Service
public class ClinicService extends AbstractService<Clinic, ClinicDTO> {

    public ClinicDTO findById(Long id) {
        return converter.toDTO(repository.findById(id).orElse(null));
    }
}
