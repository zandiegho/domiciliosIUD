package com.diplomadoWeb.domiciliosIUD.Model;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Roles")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Roles implements Serializable {

    //Hay Relacion de Muchos a Muchos con Tabla Persona

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "nombreRol", unique = true, length = 15, nullable = false)
    String nombreRol;

    @Column(name = "descripcionRol", length = 150, nullable = false)
    String descripcionRol;

    //bidereccional
    @ManyToMany(mappedBy = "roles") // -> Atributo de tabla relacionada  // opcional
    List<Persona> usuarios;
}
