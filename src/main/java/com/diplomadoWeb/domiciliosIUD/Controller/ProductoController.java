package com.diplomadoWeb.domiciliosIUD.Controller;

import com.diplomadoWeb.domiciliosIUD.Exception.Dto.ProductoDTO;
import com.diplomadoWeb.domiciliosIUD.Service.iface.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping
    public ResponseEntity<List<ProductoDTO>> index(){
        return ResponseEntity
                .ok()
                .body(productoService.findAll());
    }
}
