package com.example.service;

//^ QUESTA INTERFACCIA FIRMA I METODI DEL SERVIC. INOLTE A DIFFERENZA
//^ DELL'ABSTRACTSERVICE  ACCETTA COME PARAMETRO D'ENTRATA SOLO I DTO.

//^ Questa interfaccia firma i metodi dei Service. Osservare che, a differenza di
//^ AbstactService, dipende solo dal parametro DTO.

public interface ServiceDTO<DTO> {

    public Iterable<DTO> getAll();

    public DTO read(long id);

    public DTO insert(DTO dto);

    public DTO update(DTO dto);

    public void delete(long id);
}
