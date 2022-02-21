package com.example.service;

import org.springframework.stereotype.Service;

import com.example.dto.AppointmentDTO;
import com.example.model.Appointment;

@Service
public class AppointmentService extends AbstractService<Appointment, AppointmentDTO> {

    public AppointmentDTO findById(Long id) {
        return converter.toDTO(repository.findById(id).orElse(null));
    }
}
