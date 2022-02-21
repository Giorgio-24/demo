package com.example.service;

import org.springframework.stereotype.Service;

import com.example.dto.DoctorDTO;
import com.example.model.Doctor;

@Service
public class DoctorService extends AbstractService<Doctor, DoctorDTO> {

    public DoctorDTO findById(Long id) {
        return converter.toDTO(repository.findById(id).orElse(null));
    }
}
