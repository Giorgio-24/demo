package com.example.converter;

import org.springframework.stereotype.Component;

import com.example.dto.UserDTO;

import com.example.model.User;

//^ @COMPONENT SI METTE NEI CONVERTER.
@Component
public class UserConverter extends AbstractConverter<User, UserDTO> {

    @Override
    public User toEntity(UserDTO userDTO) {

        // ^CREA UN NUOVO USER E CON I SETTERS RIEMPIE I SUOI CAMPI CON QUELLI DEL DTO.
        User user = null;
        if (userDTO != null) {
            user = new User(userDTO.getId(), userDTO.getFirst_name(), userDTO.getLast_name(), userDTO.getUsertype(),
                    userDTO.getEmail(), userDTO.getPassword(),
                    userDTO.getVat_number());
        }
        return user;
    }

    @Override
    public UserDTO toDTO(User user) {
        UserDTO userDTO = null;
        if (user != null) {
            userDTO = new UserDTO(user.getId(), user.getFirst_name(), user.getLast_name(), user.getUsertype(),
                    user.getEmail(), user.getPassword(),
                    user.getVat_number());

        }
        return userDTO;
    }
}
