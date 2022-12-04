package com.diplomadoWeb.domiciliosIUD.Repository;

import com.diplomadoWeb.domiciliosIUD.Model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRestauranteRepository extends JpaRepository<Restaurante, Long> {

}
