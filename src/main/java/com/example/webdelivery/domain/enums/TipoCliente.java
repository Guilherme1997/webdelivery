package com.example.webdelivery.domain.enums;

public enum TipoCliente {

	PESSOAFISICA(1,"Pessoa Física"),
	
	PESSOAJURIDICA(2 ,"Pessoa  Jurídica");
	
	private int codigo;
	
	private String descricao;
	
	private TipoCliente(int codigo, String descricao) {
		this.codigo = codigo;
		
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public static TipoCliente obterTipoCliente(Integer codigo) {
		
		if(codigo == null) {
			return null;
		}
		
		for(TipoCliente item : TipoCliente.values()) {
			if(item.equals(item.getCodigo())) {
				return item;
			}
		}
		
		throw new IllegalArgumentException("Id inválido " + codigo);
		
	}
	
}

