package com.diplomadoWeb.domiciliosIUD.Service.iface;

import com.diplomadoWeb.domiciliosIUD.Exception.Dto.ProductoDTO;
import com.diplomadoWeb.domiciliosIUD.Exception.Dto.RestauranteDTO;
import com.diplomadoWeb.domiciliosIUD.Model.Restaurante;

import java.util.List;

public interface IRestauranteService {
    List<RestauranteDTO> findAll(); // TODO: Lanzar Excepcion personalizada

    public RestauranteDTO findByID(Long id); // TODO: Lanzar Excepcion personalizada

    public RestauranteDTO save(RestauranteDTO restauranteDTO); // TODO: Lanzar Excepcion personalizada

    public Restaurante findbyNombre(String nomnre); // TODO: Lanzar Excepcion personalizada

    RestauranteDTO delete(Long Id); // TODO: Lanzar Excepcion personalizada
}

