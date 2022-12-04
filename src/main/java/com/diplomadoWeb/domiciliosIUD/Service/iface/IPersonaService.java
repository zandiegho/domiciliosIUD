package com.diplomadoWeb.domiciliosIUD.Service.iface;

import com.diplomadoWeb.domiciliosIUD.Exception.Dto.PersonaDTO;

import java.util.List;

public interface IPersonaService {

    public List<PersonaDTO> findAll(); // TODO: Lanzar Excepcion personalizada

    public PersonaDTO findById(Long id); // TODO: Lanzar Excepcion personalizada

    public PersonaDTO save(PersonaDTO personaDTO); // TODO: Lanzar Excepcion personalizada

    public PersonaDTO findByNombre(String nombre); // TODO: Lanzar Excepcion personalizada
}
