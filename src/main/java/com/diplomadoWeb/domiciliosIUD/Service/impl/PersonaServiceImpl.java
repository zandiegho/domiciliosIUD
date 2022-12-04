package com.diplomadoWeb.domiciliosIUD.Service.impl;

import com.diplomadoWeb.domiciliosIUD.Exception.Dto.PersonaDTO;
import com.diplomadoWeb.domiciliosIUD.Model.Persona;
import com.diplomadoWeb.domiciliosIUD.Repository.IPersonaRepository;
import com.diplomadoWeb.domiciliosIUD.Service.iface.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaServiceImpl implements IPersonaService {
    @Autowired
    private final IPersonaRepository personaRepository;

    public PersonaServiceImpl(IPersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<PersonaDTO> findAll() {
        List<Persona> personas= personaRepository.findAll();
        //TODO: Refactoring en Mapping en paquete Util

        return personas.stream().map(p ->
                PersonaDTO.builder()
                        .id(p.getId())
                        .nombre(p.getNombre())
                        .telefono(p.getTelefono())
                        .direccion(p.getDireccion())
                        .email(p.getEmail())
                        .build()
        ).collect(Collectors.toList());
    }

    @Override
    public PersonaDTO findById(Long id) {
        return null;
    }

    @Override
    public PersonaDTO save(PersonaDTO personaDTO) {
        return null;
    }

    @Override
    public PersonaDTO findByNombre(String nombre) {
        return null;
    }

}
