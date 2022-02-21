package com.example.model;

import javax.persistence.Entity;

import javax.persistence.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//? Da controllare se può dare fastidio il nome della entità con la Y, come su Laravel.

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Specialties")

public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
}
