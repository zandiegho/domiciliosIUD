package com.diplomadoWeb.domiciliosIUD.Repository;

import com.diplomadoWeb.domiciliosIUD.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Producto es el homologo de delito en el ejercicio
@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long> {
}
