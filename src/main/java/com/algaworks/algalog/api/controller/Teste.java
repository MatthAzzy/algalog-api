package com.algaworks.algalog.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Teste {
	
	@GetMapping("/teste")
	public String TesteDeMsg() {
		return "Teste";
}
}
