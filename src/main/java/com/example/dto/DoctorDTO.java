package com.example.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class DoctorDTO {

    private Long id;

    private String npi;

    private String first_name;

    private String last_name;

    // ^SE HA DELLE FOREIGN KEYS BASTA DARE COME CAMPO IL DTO DELLA TABELLA.
    private SpecialtyDTO specialty;

    private ClinicDTO clinic;

}
