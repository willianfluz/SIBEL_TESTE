package com.primeira_api.apirest.resouces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeira_api.apirest.models.Veiculos;
import com.primeira_api.apirest.repository.VeiculoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping(value="/api")
@Api(value="API REST Veículos")
@CrossOrigin(origins="*")
public class VeiculosResource {
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@GetMapping("/veiculos")
	@ApiOperation(value="Retorna uma lista de veículos envenanados")
	public List<Veiculos> listaVeiculos(){
		return veiculoRepository.findAll();
	}
	
	@GetMapping("/veiculos/id/{id}")
	public Veiculos listaVeiculoUnico(@PathVariable(value="id")long id) {
		return veiculoRepository.findById(id);
	}
	
	
	@GetMapping(value = "/veiculos/cor/{cor}")
	public List<Veiculos> buscarPorCor(@PathVariable String cor) {
	   
	    return  veiculoRepository.findByCor(cor);
	}
	
	@GetMapping(value = "/veiculos/fabricante/{fabricante}")
	public List<Veiculos> buscarPorFabricante(@PathVariable String fabricante) {
	   
	    return  veiculoRepository.findByFabricante(fabricante);
	}
	@GetMapping(value = "/veiculos/nome/{nome}")
	public List<Veiculos> buscarPorNome(@PathVariable String nome) {
	   
	    return  veiculoRepository.findByNome(nome);
	}
	
	@PostMapping("/veiculos/cadastrar")
	public Veiculos cadastraVeiculo(@RequestBody Veiculos veiculo) {
		if(listaVeiculoUnico(veiculo.getId())==null) {
			return veiculoRepository.save(veiculo);
		}else {
			return null;
		}	
	}
	
	

}
