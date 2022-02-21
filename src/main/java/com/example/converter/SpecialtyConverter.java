package com.example.converter;

import org.springframework.stereotype.Component;

import com.example.dto.SpecialtyDTO;

import com.example.model.Specialty;

//^ @COMPONENT SI METTE NEI CONVERTER.
@Component
public class SpecialtyConverter extends AbstractConverter<Specialty, SpecialtyDTO> {

    @Override
    public Specialty toEntity(SpecialtyDTO SpecialtyDTO) {

        // ^CREA UN NUOVO Specialty E CON I SETTERS RIEMPIE I SUOI CAMPI CON QUELLI DEL
        // DTO.
        Specialty Specialty = null;
        if (SpecialtyDTO != null) {
            Specialty = new Specialty(SpecialtyDTO.getId(), SpecialtyDTO.getName());
        }
        return Specialty;
    }

    @Override
    public SpecialtyDTO toDTO(Specialty Specialty) {
        SpecialtyDTO SpecialtyDTO = null;
        if (Specialty != null) {
            SpecialtyDTO = new SpecialtyDTO(Specialty.getId(), Specialty.getName());

        }
        return SpecialtyDTO;
    }
}
