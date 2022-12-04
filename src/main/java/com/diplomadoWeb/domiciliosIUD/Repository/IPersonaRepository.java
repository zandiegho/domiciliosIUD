package com.diplomadoWeb.domiciliosIUD.Repository;

import com.diplomadoWeb.domiciliosIUD.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Persona es el homologado de Usuario en el ejercicio
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}
