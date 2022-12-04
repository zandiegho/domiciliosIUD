package com.diplomadoWeb.domiciliosIUD.Controller;

import com.diplomadoWeb.domiciliosIUD.Exception.Dto.PersonaDTO;
import com.diplomadoWeb.domiciliosIUD.Service.iface.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping
    public ResponseEntity<List<PersonaDTO>> index(){
        return ResponseEntity
                .ok()
                .body(personaService.findAll());
    }
}
