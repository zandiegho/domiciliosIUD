package com.diplomadoWeb.domiciliosIUD.Service.impl;

import com.diplomadoWeb.domiciliosIUD.Exception.Dto.PedidoDTO;
import com.diplomadoWeb.domiciliosIUD.Repository.IPedidoRepository;
import com.diplomadoWeb.domiciliosIUD.Service.iface.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PedidoServiceimpl implements IPedidoService {

    @Autowired
    private final IPedidoRepository pedidoRepository;

    public PedidoServiceimpl(IPedidoRepository pedidoRepository){
        this.pedidoRepository = pedidoRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<PedidoDTO> findAll() {
        return null;
    }

    @Override
    public PedidoDTO findByID(Long id) {
        return null;
    }

    @Override
    public PedidoDTO save(PedidoDTO pedido) {
        return null;
    }

    @Override
    public PedidoDTO delete(Long Id) {
        return null;
    }
}
