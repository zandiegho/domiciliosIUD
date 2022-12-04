package com.diplomadoWeb.domiciliosIUD.Service.impl;

import com.diplomadoWeb.domiciliosIUD.Exception.Dto.RestauranteDTO;
import com.diplomadoWeb.domiciliosIUD.Model.Restaurante;
import com.diplomadoWeb.domiciliosIUD.Repository.IRestauranteRepository;
import com.diplomadoWeb.domiciliosIUD.Service.iface.IRestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestauranteServiceImpl implements IRestauranteService {

    @Autowired
    private final IRestauranteRepository restauranteRepository;

    public RestauranteServiceImpl(IRestauranteRepository restauranteRepository){
        this.restauranteRepository = restauranteRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<RestauranteDTO> findAll(){
        List<Restaurante> restaurantes= restauranteRepository.findAll();
        // TODO : Refactoring en Mapping en paquete Util

        return restaurantes.stream().map(p ->
                RestauranteDTO.builder()
                        .id(p.getId())
                        .nombre(p.getNombre())
                        .categoria(p.getCategoria())
                        .direccion(p.getDireccion())
                        .build()
        ).collect(Collectors.toList());
    }

    @Override
    public RestauranteDTO findByID(Long id) {
        return null;
    }

    @Override
    public RestauranteDTO save(RestauranteDTO restauranteDTO) {
        return null;
    }

    @Override
    public Restaurante findbyNombre(String nombre) {
        return null;
    }

    @Override
    public RestauranteDTO delete(Long Id) {
        return null;
    }


}
