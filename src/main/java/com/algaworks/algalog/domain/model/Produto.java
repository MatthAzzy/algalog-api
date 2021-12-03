package com.algaworks.algalog.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {
	
	private Long id;
	private String marca;
	private String codigo;
	private String validade;
	private String preco;
}
