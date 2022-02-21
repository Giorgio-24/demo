package com.example.service;

import org.springframework.stereotype.Service;

import com.example.dao.UserRepository;
import com.example.dto.UserDTO;
import com.example.model.User;

@Service
public class UserService extends AbstractService<User, UserDTO> {
    // ^ ESTENDENDO L'ABSTRACTSERVICE HA GIA EREDITATO TUTTI I METODI CRUD,
    // ^ IN PIU VADO A DEFINIRE IL MIO METODO CUSTOM PER IL LOGIN.
    public UserDTO findByEmailAndPassword(String email, String password) {
        return converter.toDTO(((UserRepository) repository).findByEmailAndPassword(email, password));
    }
}
