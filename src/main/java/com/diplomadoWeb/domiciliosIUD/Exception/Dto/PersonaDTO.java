package com.diplomadoWeb.domiciliosIUD.Exception.Dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class PersonaDTO {
    Long id;
    String nombre;
    String telefono;
    String direccion;
    String email;
}
