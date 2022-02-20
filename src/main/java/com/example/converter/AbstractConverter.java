package com.example.converter;

import java.util.ArrayList;
import java.util.List;

//^ QUESTA CLASSE IMPLEMENTA L'INTERFACCIA CONVERTER E QUINDI TUTTI I METODI CHE CONVERTONO LE LISTE.

//^ public abstract perchè è una classe astratta.
public abstract class AbstractConverter<Entity, DTO> implements Converter<Entity, DTO> {

    // ^ prende una lista di DTO e la converte in una lista di Entità.
    public List<Entity> toEntityList(Iterable<DTO> listDTO) {
        List<Entity> list = new ArrayList<Entity>();

        if (listDTO != null) {
            for (DTO dto : listDTO) {
                Entity entity = toEntity(dto);
                list.add(entity);
            }
        }
        return list;
    }

    // ^ prende una lista di entità e la converte in una lista di DTO.
    public List<DTO> toDTOList(Iterable<Entity> listEntity) {
        List<DTO> list = new ArrayList<DTO>();

        if (listEntity != null) {
            for (Entity entity : listEntity) {
                DTO dto = toDTO(entity);
                list.add(dto);
            }
        }
        return list;
    }
}
