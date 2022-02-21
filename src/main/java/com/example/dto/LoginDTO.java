package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//^IL MODEL DI QUESTO DTO NON ESISTE, SERVE SOLO A TRASFERIRE AL DB
//^UN OGGETTO CHE CONTENGA LA MAIL E LA PASSWORD, COSI DA FARE L'ACCESSO.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDTO {

    private String email;

    private String password;
}
