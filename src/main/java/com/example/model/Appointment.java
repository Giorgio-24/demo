package com.example.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column

    // ?DA CONTOLLARE SE I FORMATI DATE E TIME SONO GIUSTI.
    private Date date;

    private Time time;

    private String note;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // ^SICCOME DEVE PRENDERE PIU FOREIGN KEYS DALLA STESSA TABELLA ALLORA
    // ^ FACCIO UN OGGETTO DOVE SPECIFICO ANCHE LE COLONNE.
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "doctor_id", referencedColumnName = "id"),
            @JoinColumn(name = "clinic_id", referencedColumnName = "doc_clinic_id")
    })

    private Doctor doctor;

}
