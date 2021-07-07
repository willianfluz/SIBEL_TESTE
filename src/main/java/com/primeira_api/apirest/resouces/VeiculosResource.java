package com.primeira_api.apirest.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	

}
