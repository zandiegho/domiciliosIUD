package com.diplomadoWeb.domiciliosIUD.Model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Usuarios")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "nombre", length = 50, nullable = false)
    String nombre;

    @Column(name = "telefono", length = 15, nullable = false)
    String telefono;

    @Column(name = "direccion", length = 150, nullable = false)
    String direccion;

    @Column(name = "email", unique = true, length = 50, nullable = false)
    String email;


    //HAY RELACION DE MUCHOS A MUCHOS CON LA TABLA ROL
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "roles_persona",
            joinColumns = {@JoinColumn(name = "persona_id")},
            inverseJoinColumns = {@JoinColumn(name = "roles_id")}
    )

    List<Roles> roles;

}
