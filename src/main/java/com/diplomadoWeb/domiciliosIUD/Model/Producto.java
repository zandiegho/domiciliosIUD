package com.diplomadoWeb.domiciliosIUD.Model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "producto")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "nombre", unique = true, length = 100, nullable = false)
    String nombre;

    @Column(name = "descripcion", length = 150, nullable = false)
    String descripcion;

    @Column(name = "precio", nullable = false)
    double precio;

    @ManyToOne
    @JoinColumn(name = "restaurante_Id")
    Restaurante restaurante;





}
