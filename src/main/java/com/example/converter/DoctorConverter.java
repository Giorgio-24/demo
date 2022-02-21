package com.example.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dto.DoctorDTO;
import com.example.dto.SpecialtyDTO;
import com.example.dto.ClinicDTO;
import com.example.model.Doctor;
import com.example.model.Specialty;
import com.example.model.Clinic;

@Component
public class DoctorConverter extends AbstractConverter<Doctor, DoctorDTO> {
    // ^SE SI HANNO TABELLE ESTERNE CON CUI ABBIAMO RELAZIONI METTO @AUTOWIRED
    @Autowired
    SpecialtyConverter specialtyConverter;
    @Autowired
    ClinicConverter clinicConverter;

    @Override
    public Doctor toEntity(DoctorDTO DoctorDTO) {
        Doctor Doctor = null;
        if (DoctorDTO != null) {
            SpecialtyDTO specialtyDTO = DoctorDTO.getSpecialty();
            ClinicDTO clinicDTO = DoctorDTO.getClinic();

            Specialty specialty = specialtyConverter.toEntity(specialtyDTO);
            Clinic clinic = clinicConverter.toEntity(clinicDTO);

            Doctor = new Doctor(DoctorDTO.getId(), DoctorDTO.getNpi(), DoctorDTO.getFirst_name(),
                    DoctorDTO.getLast_name(),
                    specialty, clinic);
        }
        return Doctor;
    }

    @Override
    public DoctorDTO toDTO(Doctor doctor) {
        DoctorDTO doctorDTO = null;
        if (doctor != null) {
            Specialty specialty = doctor.getSpecialty();
            Clinic clinic = doctor.getClinic();

            SpecialtyDTO specialtyDTO = specialtyConverter.toDTO(specialty);
            ClinicDTO clinicDTO = clinicConverter.toDTO(clinic);

            doctorDTO = new DoctorDTO(doctor.getId(), doctor.getNpi(), doctor.getFirst_name(),
                    doctor.getLast_name(),
                    specialtyDTO, clinicDTO);
        }
        return doctorDTO;
    }

}