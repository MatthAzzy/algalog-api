package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Produto;

@RestController
public class ProdutoController {
	
	@GetMapping("/produtos")
	public List<Produto> listar() {
		var produto1 = new Produto();
		produto1.setId(1L);
		produto1.setMarca("Piracanjuba");
		produto1.setValidade("12/10/2012");
		produto1.setPreco("R$32,00");
		produto1.setCodigo("934949456");
		
		var produto2 = new Produto();
		produto2.setId(2L);
		produto2.setMarca("Fandago");
		produto2.setValidade("23/03/2012");
		produto2.setPreco("R$4,50");
		produto2.setCodigo("95431326");
		
		
		return Arrays.asList(produto1, produto2);
	}
}
