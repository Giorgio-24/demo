package com.example.dto;

import java.sql.Date;
import java.sql.Time;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class AppointmentDTO {

    private Long id;

    // ?DA CONTOLLARE SE I FORMATI DATE E TIME SONO GIUSTI.
    private Date date;

    private Time time;

    private String note;

    private UserDTO user;

    private DoctorDTO doctor;

}
