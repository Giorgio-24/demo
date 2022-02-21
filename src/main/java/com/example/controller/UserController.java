package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.dto.LoginDTO;
import com.example.dto.UserDTO;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
// ^ COSI FACENDO DOVREI RIUSCIRE A FAR FUNZIONARE IL TUTTO
// ^ SIA SU ANGULAR(4200) SIA SU REACT(3000).
@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:3000" })
public class UserController extends AbstractController<UserDTO> {

    @Autowired
    private UserService userService;

    // POST Angular a UserDTO
    @PostMapping(value = "/login")
    public UserDTO login(@RequestBody LoginDTO loginDTO) {
        return userService.findByEmailAndPassword(loginDTO.getEmail(), loginDTO.getPassword());
    }
}
