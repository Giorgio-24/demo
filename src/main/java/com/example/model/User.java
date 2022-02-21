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

//^ MODEL DELL'ENTITA USER, CONTIENE ANCHE L'ENUM CHE DEFINISCE GLI USERTYPE.

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Users")

public class User {
    public enum Usertype {
        ADMIN, USER, DOCTOR
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String first_name;

    private String last_name;

    @Enumerated(EnumType.STRING)
    private Usertype usertype;

    private String email;

    private String password;

    // ? SUL DB NON E' UNIQUE PERCHE NON LO FACEVA METTERE,
    // ? DA CONTROLLARE SE PUO DARE PROBLEMI.

    @Column(unique = true)
    private String vat_number;
}
