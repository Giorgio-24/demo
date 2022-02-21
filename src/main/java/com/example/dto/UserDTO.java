package com.example.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.example.model.User.Usertype;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class UserDTO {

    private Long id;

    private String first_name;

    private String last_name;

    private Usertype usertype;

    private String email;

    private String password;

    private String vat_number;

}
