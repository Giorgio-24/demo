package com.example.converter;

import java.util.List;

//^QUESTA INTERFACCIA FIRMA I METODI DEI CONVERTER PARAMETRIZZATI DAI TIPI ENTITY E DTO.

public interface Converter<Entity, DTO> {
    // ^ La firma di questi metodi si aspetta come parametro di entrata un
    // ^ DTO\Entity oppure una lista di essi, e lo restituirà
    // ^ in uscita convertito in un DTO\Entity oppure una lista di essi.
    public Entity toEntity(DTO dto);

    public DTO toDTO(Entity entity);

    public List<DTO> toDTOList(Iterable<Entity> entityList);

    public List<Entity> toEntityList(Iterable<DTO> dtoList);

}