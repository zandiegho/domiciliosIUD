package com.diplomadoWeb.domiciliosIUD.Service.impl;

import com.diplomadoWeb.domiciliosIUD.Exception.Dto.ProductoDTO;
import com.diplomadoWeb.domiciliosIUD.Model.Producto;
import com.diplomadoWeb.domiciliosIUD.Repository.IProductoRepository;
import com.diplomadoWeb.domiciliosIUD.Service.iface.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private final IProductoRepository productoRepository;

    public ProductoServiceImpl(IProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<ProductoDTO> findAll() {
        List<Producto> productos = productoRepository.findAll();
        //TODO: Refactoring en Mapping en paquete Util

        return productos.stream().map(p ->
                    ProductoDTO.builder()
                            .id(p.getId())
                            .nombre(p.getNombre())
                            .descripcion(p.getDescripcion())
                            .precio(p.getPrecio())
                            .build()
                    ).collect(Collectors.toList());
    }

    @Override
    public ProductoDTO findById(Long Id) {
        return null;
    }

    @Override
    public ProductoDTO save(ProductoDTO productoDTO) {
        return null;
    }

    @Override
    public ProductoDTO delete(Long Id) {
        return null;
    }
}
