package com.primeira_api.apirest.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.primeira_api.apirest.models.Veiculos;


public interface VeiculoRepository extends JpaRepository<Veiculos, Long>{

}
