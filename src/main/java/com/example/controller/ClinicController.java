package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.dto.ClinicDTO;
import com.example.service.ClinicService;

@RestController
@RequestMapping("/clinic")
@CrossOrigin(origins = "http://localhost:4200")
public class ClinicController extends AbstractController<ClinicDTO> {

    @Autowired
    private ClinicService clinicService;

}
