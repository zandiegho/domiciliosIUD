package com.diplomadoWeb.domiciliosIUD.Service.iface;

import com.diplomadoWeb.domiciliosIUD.Exception.Dto.ProductoDTO;

import java.util.List;

public interface IProductoService {

    //Listar Productos
    public List<ProductoDTO> findAll(); // TODO: Lanzar Excepcion personalizada

    // Listar producto por ID
    public ProductoDTO findById(Long Id); // TODO: Lanzar Excepcion personalizada

    //Guardar un producto
    public ProductoDTO save(ProductoDTO productoDTO); //TODO: Lanzar Excepcion personalizada

    // Borrar un Producto
    public ProductoDTO delete(Long Id); // TODO: Lanzar Excepcion personalizada

}
