package com.diplomadoWeb.domiciliosIUD.Model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "restaurante")
@Data
//@FieldDefaults(level = AccessLevel.PRIVATE) // pone privados los campos de la clase sin la necesidad de declarlos.
public class Restaurante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", unique = true, length = 50, nullable = false)
    private String nombre;

    @Column(name = "categoria",length = 50, nullable = false)
    private String categoria;

    @Column(name = "direccion",length = 150, nullable = false)
    private String direccion;


}
