package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

//^ import com.example.service.ServiceDTO;

//^ public abstract perchè è una classe astratta, 
//^ inoltre viene dichiarata l'interfaccia ServiceDTO<DTO>.
public abstract class AbstractController<DTO> {

    // ^@Autowired sostituisce il costruttore iniettando le istanze in una classe.

    @Autowired
    private ServiceDTO<DTO> service;

    // ^L'interfaccia Iterable serve per fare i cicli for su questo oggetto.
    /*
     * Non è fondamentale per far si che si possa ciclare su un oggetto, ma rende il
     * codice più chiaro, più veloce da scrivere e meno incline agli errori.
     */

    @GetMapping("/getall")
    public Iterable<DTO> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam("id") long id) {
        service.delete(id);
    }

    @PutMapping("/update")
    public DTO update(@RequestBody DTO dto) {
        service.update(dto);
        return dto;
    }

    @PostMapping("/insert")
    public DTO insert(@RequestBody DTO dto) {
        service.insert(dto);
        return dto;
    }

    @GetMapping("/read")
    public DTO read(long id) {
        return service.read(id);
    }
}
