package com.diplomadoWeb.domiciliosIUD.Repository;

import com.diplomadoWeb.domiciliosIUD.Model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// Pedido es el homologado de Caso en el ejercicio.
@Repository // ambiguo
public interface IPedidoRepository extends JpaRepository<Pedido, Long> {

}
