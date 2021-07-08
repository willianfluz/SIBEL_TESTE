package com.primeira_api.apirest.repository;





import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.primeira_api.apirest.models.Veiculos;


public interface VeiculoRepository extends JpaRepository<Veiculos, Long>{
	Veiculos findById(long id);
	List<Veiculos> findByCor(String cor);
	List<Veiculos> findByFabricante(String fabricante);
	List<Veiculos> findByNome(String nome);
	

	

}
