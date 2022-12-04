package com.diplomadoWeb.domiciliosIUD.Service.iface;

import com.diplomadoWeb.domiciliosIUD.Exception.Dto.PedidoDTO;
import com.diplomadoWeb.domiciliosIUD.Exception.Dto.ProductoDTO;

import java.util.List;

public interface IPedidoService {
    // Consultar todos los casos - Pedidos
    public List<PedidoDTO> findAll(); // TODO: Lanzar Excepcion personalizada

    //Listar por ID de pedido
    public PedidoDTO findByID(Long id); //// TODO: Lanzar Excepcion personalizada

    //Guardar un pedido
    public PedidoDTO save(PedidoDTO pedido); // TODO: Lanzar Excepcion personalizada

    // Borrar un Producto
    public PedidoDTO delete(Long Id); // TODO: Lanzar Excepcion personalizada




}
