package com.diplomadoWeb.domiciliosIUD.Controller;

import com.diplomadoWeb.domiciliosIUD.Exception.Dto.PersonaDTO;
import com.diplomadoWeb.domiciliosIUD.Exception.Dto.RestauranteDTO;
import com.diplomadoWeb.domiciliosIUD.Service.iface.IRestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {

    @Autowired
    private IRestauranteService restauranteService;

    @GetMapping
    public ResponseEntity<List<RestauranteDTO>> index(){
        return ResponseEntity
                .ok()
                .body(restauranteService.findAll());
    }
}
