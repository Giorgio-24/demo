package com.example.converter;

import org.springframework.stereotype.Component;

import com.example.dto.ClinicDTO;

import com.example.model.Clinic;

//^ @COMPONENT SI METTE NEI CONVERTER.
@Component
public class ClinicConverter extends AbstractConverter<Clinic, ClinicDTO> {

    @Override
    public Clinic toEntity(ClinicDTO ClinicDTO) {

        // ^CREA UN NUOVO Clinic E CON I SETTERS RIEMPIE I SUOI CAMPI CON QUELLI DEL
        // DTO.
        Clinic Clinic = null;
        if (ClinicDTO != null) {
            Clinic = new Clinic(ClinicDTO.getId(), ClinicDTO.getAddress(), ClinicDTO.getDescription());
        }
        return Clinic;
    }

    @Override
    public ClinicDTO toDTO(Clinic Clinic) {
        ClinicDTO ClinicDTO = null;
        if (Clinic != null) {
            ClinicDTO = new ClinicDTO(Clinic.getId(), Clinic.getAddress(), Clinic.getDescription());

        }
        return ClinicDTO;
    }
}
