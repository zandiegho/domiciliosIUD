package com.diplomadoWeb.domiciliosIUD.Repository;

import com.diplomadoWeb.domiciliosIUD.Model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// Pedido es el homologado de Caso en el ejercicio.
@Repository // ambiguo
public interface IPedidoRepository extends JpaRepository<Pedido, Long> {

    //@Query("UPDATE Pedido p SET p.restaurante=valor WHERE p.id = condicion")
    //@Query("UPDATE Pedido p SET p.cliente=?1 WHERE p.id=?2")
    //public Boolean setComplete(Boolean complete, Long id);
    //Verificar Este campo y campo y consulta.

    // Este epsacio nos muestra u oculta el precio en la app.
    @Query("UPDATE Pedido p SET p.precio = ?1 WHERE p.id=?2")
    public Boolean setPriceVisible(Boolean priceVisible, Long id);
}
