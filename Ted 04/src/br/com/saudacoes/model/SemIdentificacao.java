package br.com.saudacoes.model;

public class SemIdentificacao extends Pessoa{

	public SemIdentificacao(String nome, String sexo) {
		super(nome, sexo);
		System.out.println("Olá " + this.nome);
	}
}
