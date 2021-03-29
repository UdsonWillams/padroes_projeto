package br.com.saudacoes.model;

public class FactoryPessoa {

	public Pessoa getPessoa(String nome, String sexo) {
		if (sexo.equals("H")) {
			return new Homem(nome, sexo);
		} else if (sexo.equals("M")) {
			return new Mulher(nome, sexo);
		} else {
			return new SemIdentificacao(nome, sexo);
		}
	}
}
