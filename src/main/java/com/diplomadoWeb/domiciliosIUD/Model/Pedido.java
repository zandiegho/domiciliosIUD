package com.diplomadoWeb.domiciliosIUD.Model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


//Pedido es el homoogado de Caso
@Entity
@Table(name = "Pedido")
@Data
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "Cliente",length = 50, nullable = false)
//    private String cliente;

//    @Column(name = "Restaurante",length = 50, nullable = false)
//    private String restaurante;

    @Column(name = "telefonoCliente",length = 15, nullable = false)
    private String telefonoCliente;

    @Column(name = "direccionCliente",length = 150, nullable = false)
    private String direccionCliente;


    @Column(name = "precio", nullable = false)
    private double precio;

    @ManyToOne
    @JoinColumn(name = "producto_Id")
    Producto producto;

    @ManyToOne
    @JoinColumn(name = "restaurante_Id")
    Restaurante restaurante;

    @ManyToOne
    @JoinColumn(name = "cliente_Id")
    Persona cliente;

}
