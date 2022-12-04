package com.diplomadoWeb.domiciliosIUD.Controller;

import com.diplomadoWeb.domiciliosIUD.Exception.Dto.PedidoDTO;
import com.diplomadoWeb.domiciliosIUD.Service.iface.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private IPedidoService pedidoService;

    @GetMapping
    public ResponseEntity<List<PedidoDTO>> index(){
        return ResponseEntity
                .ok()
                .body(pedidoService.findAll());
    }

}
