package com.example.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dto.AppointmentDTO;
import com.example.dto.UserDTO;
import com.example.dto.DoctorDTO;
import com.example.model.Appointment;
import com.example.model.User;
import com.example.model.Doctor;

@Component
public class AppointmentConverter extends AbstractConverter<Appointment, AppointmentDTO> {
    // ^SE SI HANNO TABELLE ESTERNE CON CUI ABBIAMO RELAZIONI METTO @AUTOWIRED
    @Autowired
    UserConverter userConverter;
    @Autowired
    DoctorConverter doctorConverter;

    @Override
    public Appointment toEntity(AppointmentDTO appointmentDTO) {
        Appointment appointment = null;
        if (appointmentDTO != null) {
            UserDTO userDTO = appointmentDTO.getUser();
            DoctorDTO doctorDTO = appointmentDTO.getDoctor();

            User user = userConverter.toEntity(userDTO);
            Doctor doctor = doctorConverter.toEntity(doctorDTO);

            appointment = new Appointment(appointmentDTO.getId(), appointmentDTO.getDate(), appointmentDTO.getTime(),
                    appointmentDTO.getNote(),
                    user, doctor);
        }
        return appointment;
    }

    @Override
    public AppointmentDTO toDTO(Appointment appointment) {
        AppointmentDTO appointmentDTO = null;
        if (appointment != null) {
            User user = appointment.getUser();
            Doctor doctor = appointment.getDoctor();

            UserDTO userDTO = userConverter.toDTO(user);
            DoctorDTO doctorDTO = doctorConverter.toDTO(doctor);

            appointmentDTO = new AppointmentDTO(appointment.getId(), appointment.getDate(), appointment.getTime(),
                    appointment.getNote(),
                    userDTO, doctorDTO);
        }
        return appointmentDTO;
    }

}
