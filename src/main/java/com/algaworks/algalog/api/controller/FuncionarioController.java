package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Funcionario;

@RestController
public class FuncionarioController {
	
	@GetMapping("/funcionarios")
	public List<Funcionario> listar() {
		var func1 = new Funcionario();
		func1.setId(1L);
		func1.setNome("Rogerin");
		func1.setIdade("35 anos");
		func1.setCpf("312.435.122-35");
		func1.setTelefone("(24)93467563");
		func1.setEndereco("Rua da Lama");
		
		var func2 = new Funcionario();
		func2.setId(2L);
		func2.setNome("Robertin");
		func2.setIdade("30 anos");
		func2.setCpf("234.465.445-67");
		func2.setTelefone("(27)99823543");
		func2.setEndereco("Rua Vitória");
		
		
		return Arrays.asList(func1, func2);
	}
}
